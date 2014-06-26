package com.navalbattle.model;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager {

	private static SoundManager instance = null;

	public static int NUMBER_OF_CHANELS = 2;

	private SoundPool soundPool = new SoundPool(SoundService.NUMBER_OF_CHANELS,
			AudioManager.STREAM_MUSIC, 0);

	private SoundManager() {
		super();
		// TODO: add creation here, binding to the SoundService
	}

	public static SoundManager getInstance() {
		if (instance == null) {
			return new SoundManager();
		}
		return instance;
	}

	public void playSound(Context context, int resId) {
		int soundIndex = soundPool.load(context, resId, 2);
		soundPool.play(soundIndex, 1 , 1 , 2 , -1 , 1);
	}
}
