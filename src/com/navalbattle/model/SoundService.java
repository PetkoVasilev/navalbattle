package com.navalbattle.model;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.IBinder;

public class SoundService extends Service {

	public static int NUMBER_OF_CHANELS = 2;
	
	private SoundPool soundPool = new SoundPool(SoundService.NUMBER_OF_CHANELS, AudioManager.STREAM_MUSIC, 0);
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
