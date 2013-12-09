package com.nativeapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	
	//objects
	
	private User welcome;
	private Settings how;
	private Exit seeya;
	
	private Button startButton;
	private Button highscoreButton;
	private Button SettingsButton;
    private Button ExitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		welcome = new User(this);
		
		startButton = (Button) findViewById(R.id.Start);
		startButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent GameplayIntent = new Intent(MainActivity.this,
                Gameplay.class);
                MainActivity.this.startActivity(GameplayIntent);
                //MainActivity.this.finish();
                
			}

		});
		
		highscoreButton = (Button) findViewById(R.id.Highscores);
		highscoreButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent HighscoreIntent = new Intent(MainActivity.this,
                Highscore.class);
                MainActivity.this.startActivity(HighscoreIntent);

                
			}

		});
		
		SettingsButton = (Button) findViewById(R.id.Settings);
		SettingsButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent SettingsIntent = new Intent(MainActivity.this,
                Settings.class);
                MainActivity.this.startActivity(SettingsIntent);

                
			}

		});
		
		ExitButton = (Button) findViewById(R.id.Exit);
		ExitButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				
				seeya = new Exit(MainActivity.this);
                
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	

}
