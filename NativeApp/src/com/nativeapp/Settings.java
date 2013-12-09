

package com.nativeapp;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Settings extends Activity{
	Context SettingsContext = null;
	Activity SettingsActivity = null;

    

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


	
		setContentView(R.layout.activity_settings);
		
		Button ExitButton = (Button) findViewById(R.id.Continue);
		ExitButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Intent gameIntent = new Intent(Settings.this,
                //        MainActivity.class);
                //Settings.this.startActivity(gameIntent);
                Settings.this.finish();
                
			}

		});
		
    }
	
	
}