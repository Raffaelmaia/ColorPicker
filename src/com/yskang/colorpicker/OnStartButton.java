package com.yskang.colorpicker;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

public class OnStartButton implements OnClickListener {

	private AlertDialog dialog;

	public OnStartButton(AlertDialog dialog) {
		this.dialog = dialog;
	}
	
	@Override
	public void onClick(View v) {
		dialog.show();
	}

}
