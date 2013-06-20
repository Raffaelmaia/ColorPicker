package com.example.colorpicker.test;

import org.jmock.Expectations;
import org.jmock.Mockery;

import com.example.colorpicker.OnSVPickerListener;
import com.example.colorpicker.OnUpdateColorPicker;

import junit.framework.TestCase;

public class OnSVPickerListenerUnitTest extends TestCase {

	Mockery context = new Mockery();
	OnUpdateColorPicker colorPicker = context.mock(OnUpdateColorPicker.class);
	OnSVPickerListener onSVPickerListener = new OnSVPickerListener(colorPicker);
	
	private final static float x = 10;
	private final static float y = 10;
	
	public void testPreviewColorBoxShouldUpdateAndMarkDisplayedWhenUserTouchSVColorBox() throws Exception {
		context.checking(new Expectations(){{
			atLeast(1).of(colorPicker).updatePreviewBox((int)x, (int)y);
			atLeast(1).of(colorPicker).updateSelectionMark((int)x, (int)y);
		}});
		
		onSVPickerListener.onSelect(x, y);
		
		context.assertIsSatisfied();
	}
}