package com.navalbattle.controller;

import java.util.Observable;
import java.util.Observer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.navalbattle.model.data.Intents;

public class SplashScreenActivity extends Activity implements Observer,
OnClickListener {

@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		startActivity(Intents.MAIN_MENU_ACTIVITY_INTENT);
		}



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		
	}

}
