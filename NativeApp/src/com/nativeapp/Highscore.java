package com.nativeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Highscore extends Activity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


	
		setContentView(R.layout.activity_highscores);
		
		Button ExitButton = (Button) findViewById(R.id.Back);
		ExitButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Intent gameIntent = new Intent(Settings.this,
                //        MainActivity.class);
                //Settings.this.startActivity(gameIntent);
                Highscore.this.finish();
                
			}

		});
		
    }
	
}