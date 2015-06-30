package com.tangoshanky.facts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeScreen extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_screen);
		
		Thread backgroundThread = new Thread(){
			public void run(){
				try{
				sleep(5*1000);
				Intent welcomeIntent = new Intent(getBaseContext(),FactMainActivity.class);
				startActivity(welcomeIntent);
				finish();
				}
				catch(Exception e)
				{
					
				}
			}
		};
		backgroundThread.start();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
