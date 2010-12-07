package com.navalbattle.controller;

import java.util.Observable;
import java.util.Observer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.navalbattle.R;
import com.navalbattle.model.data.Intents;

/**
 * No comment needed. Activity which is shown for brief seconds with some fancy
 * animation.
 * 
 * @author Administrator
 * 
 */
public class SplashScreenActivity extends Activity implements Observer,
		OnClickListener {

	private Handler handler = new Handler();

	private FrameLayout splashScreenBackground;
	private ImageView logoImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		splashScreenBackground = (FrameLayout) findViewById(R.id.splash_screen);
		logoImage = (ImageView) findViewById(R.id.logo);

	}

	@Override
	protected void onStart() {
		super.onStart();

		// mSplashScreenLayout.setBackgroundResource(R.drawable.splash_screen_background);
		// mSplashScreenView.setBackgroundResource(R.drawable.splash_screen_logo);
	}

	@Override
	protected void onResume() {
		super.onResume();

		handler.postDelayed(new Runnable() {
			public void run() {
				startActivity(Intents.MAIN_MENU_ACTIVITY_INTENT);
			}
		}, 3000);

		handler.post(logoTranslation);
	}

	@Override
	protected void onStop() {
		super.onStop();

	}

	@Override
	public void onClick(View v) {

	}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub

	}

	private final Runnable logoTranslation = new Runnable() {
		public void run() {
			Animation animation = AnimationUtils.loadAnimation(
					SplashScreenActivity.this, android.R.anim.fade_in);

			logoImage.startAnimation(animation);
		}
	};

}
