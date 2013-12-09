package com.nativeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Gameplay extends Activity{
	
	
    private Button ExitButton;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        
		setContentView(R.layout.activity_gameplay);
		ExitButton = (Button) findViewById(R.id.Pause);
		ExitButton.setOnClickListener(new OnClickListener() {
			@SuppressWarnings("unused")
			@Override
			public void onClick(View arg0) {

				Pause pauseIt;
				pauseIt = new Pause(Gameplay.this);
                
			}

		});
		
		
    }
	
}