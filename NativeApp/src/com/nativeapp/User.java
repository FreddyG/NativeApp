package com.nativeapp;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class User{
	Context UserContext = null;
	
	
	public User(Context context){
		
		this.UserContext = context;
		final Activity UserActivity = (context instanceof Activity)? (Activity) context:null;

		final Dialog dialog = new Dialog(UserActivity);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.popup_user);
	    
		// set the custom dialog components - text, image and button
		TextView text = (TextView) dialog.findViewById(R.id.textDialog);
		text.setText("Please enter your username:\n");

		dialog.show();
		Button ContinueButton = (Button) dialog.findViewById(R.id.ContinueButton);
		// if button is clicked, close the custom dialog
		ContinueButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
				
			}
		});				

	}
	void saveUser(){
		
	}
}