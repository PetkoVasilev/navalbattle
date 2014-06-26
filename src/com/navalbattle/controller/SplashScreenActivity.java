package com.navalbattle.controller;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.navalbattle.R;
import com.navalbattle.model.SoundManager;
import com.navalbattle.model.data.Intents;

/**
 * No comment needed. Activity which is shown for brief seconds with some fancy
 * animation.
 * 
 * @author Administrator
 * 
 */
/**
 * @author Administrator
 *
 */
public class SplashScreenActivity extends Activity implements OnClickListener {

	private Handler handler = new Handler();

	SoundPool soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
	
	private ImageView logoImage;
	private TextView soundQuestion;
	private TextView yesAnswer;
	private TextView noAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.splash);

		logoImage = (ImageView) findViewById(R.id.logo);
		
		soundQuestion = (TextView) findViewById(R.id.soundQuestion);
		yesAnswer = (TextView)  findViewById(R.id.ok);
		yesAnswer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SoundManager.getInstance().playSound(SplashScreenActivity.this, R.raw.mainsnd);
				startActivity(Intents.MAIN_MENU_ACTIVITY_INTENT); 
				finish();
			}
		});
		noAnswer = (TextView) findViewById(R.id.no);
		noAnswer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {		
				startActivity(Intents.MAIN_MENU_ACTIVITY_INTENT); 
				finish();
			}
		});
		
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

		// handler.postDelayed(nextActivityTransition, 4000);
		handler.post(logoTranslation);
		handler.postDelayed(soundQuestionInception, 2000);

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
		// TODO: add body
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			if (keyCode == KeyEvent.KEYCODE_BACK) {
				handler.removeCallbacks(logoTranslation);
				handler.removeCallbacks(soundQuestionInception);
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

			getLogoImage().startAnimation(animation);
		}
	};

	private final Runnable soundQuestionInception = new Runnable() {
		@Override
		public void run() {
			Animation animation = AnimationUtils.loadAnimation(
					SplashScreenActivity.this, android.R.anim.fade_in);

			getSoundQuestion().setVisibility(View.VISIBLE);
			getYesAnswer().setVisibility(View.VISIBLE);
			getNoAnswer().setVisibility(View.VISIBLE);
			
			getSoundQuestion().startAnimation(animation);
			getYesAnswer().startAnimation(animation);
			getNoAnswer().startAnimation(animation);
		}
	};

	public TextView getSoundQuestion() {
		return soundQuestion;
	}

	public ImageView getLogoImage() {
		return logoImage;
	}

	public TextView getYesAnswer() {
		return yesAnswer;
	}

	public TextView getNoAnswer() {
		return noAnswer;
	}

}
