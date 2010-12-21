package com.navalbattle.controller;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
public class SplashScreenActivity extends Activity implements OnClickListener {

	private Handler handler = new Handler();

	private ImageView logoImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		logoImage = (ImageView) findViewById(R.id.logo);

	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onStart() {
		super.onStart();

	}

	@Override
	protected void onResume() {
		super.onResume();

		handler.postDelayed(nextActivityTransition, 4000);

		handler.post(logoTranslation);
	}

	@Override
	protected void onPause() {
		super.onPause();

	}

	@Override
	protected void onStop() {
		super.onStop();

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onClick(View v) {
		// FIXME: this is not working, click event is not received here, I don't
		// know why
		handler.removeCallbacks(nextActivityTransition);
		handler.removeCallbacks(logoTranslation);
		startActivity(Intents.MAIN_MENU_ACTIVITY_INTENT);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			if (keyCode == KeyEvent.KEYCODE_BACK) {
				handler.removeCallbacks(nextActivityTransition);
				finish();
				return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}

	private final Runnable logoTranslation = new Runnable() {
		@Override
		public void run() {
			Animation animation = AnimationUtils.loadAnimation(
					SplashScreenActivity.this, android.R.anim.fade_in);

			logoImage.startAnimation(animation);
		}
	};

	private final Runnable nextActivityTransition = new Runnable() {
		@Override
		public void run() {
			startActivity(Intents.MAIN_MENU_ACTIVITY_INTENT);
			finish();
		}
	};

}
