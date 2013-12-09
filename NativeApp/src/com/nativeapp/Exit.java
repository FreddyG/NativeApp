package com.nativeapp;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class Exit{
	Context ExitContext = null;
	
	
	public Exit(Context context){
		
		this.ExitContext = context;
		final Activity ExitActivity = (context instanceof Activity)? (Activity) context:null;

		final Dialog dialog = new Dialog(ExitActivity);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.popup_exit);
	    
		// set the custom dialog components - text, image and button
		TextView text = (TextView) dialog.findViewById(R.id.textDialog);
		text.setText("Are you sure you want to exit the game?\n");

		dialog.show();
		Button AcceptButton = (Button) dialog.findViewById(R.id.AcceptButton);
		// if button is clicked, close the custom dialog
		AcceptButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ExitActivity.finish();
				dialog.dismiss();
				
			}
		});
		Button DeclineButton = (Button) dialog.findViewById(R.id.DeclineButton);
		DeclineButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
				
			}
		});

	}

}