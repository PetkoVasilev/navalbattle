package com.navalbattle;

import android.app.Application;
import android.content.Context;

public class NavalBattleApp extends Application {
	
	private static NavalBattleApp instance;

    public NavalBattleApp() {
        instance = this;
    }

    public static Context getContext() {
        return instance;
    }
}
