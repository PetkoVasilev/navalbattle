package com.navalbattle.model.data;

import android.content.Intent;

import com.navalbattle.controller.AboutActivity;
import com.navalbattle.controller.ChoseMissionActivity;
import com.navalbattle.controller.ControlsActivity;
import com.navalbattle.controller.GameActivity;
import com.navalbattle.controller.GameStatusActivity;
import com.navalbattle.controller.LadderActivity;
import com.navalbattle.controller.MainMenuActivity;
import com.navalbattle.controller.MultiplayerGameLobbyActivity;
import com.navalbattle.controller.SplashScreenActivity;

public class Intents {

	/**
	 * Intent, used for starting the {@link AboutActivity}.
	 */
	public final static Intent ABOUT_ACTIVITY_INTENT = new Intent(
			"com.navalbattle.controller.ABOUT_ACTIVITY");

	/**
	 * Intent, used for starting the {@link MainMenuActivity}.
	 */
	public final static Intent MAIN_MENU_ACTIVITY_INTENT = new Intent(
			"com.navalbattle.controller.MAIN_MENU_ACTIVITY");
	
   /**
	 * Intent, used for starting the {@link ChoseMissionActivity}.
	 */		
	public final static Intent CHOSE_MISSION_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.CHOSE_MISSION_ACTIVITY");

  /**
	 * Intent, used for starting the {@link ControlsActivity}.
	 */		
	public final static Intent CONTROLS_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.CONTROLS_ACTIVITY");

   /**
	 * Intent, used for starting the {@link GameActivity}.
	 */		
	public final static Intent GAME_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.GAME_ACTIVITY");
    
       /**
	 * Intent, used for starting the {@link GameStatusActivity}.
	 */		
	public final static Intent GAME_STATUS_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.GAME_STATUS_ACTIVITY");
	
	       /**
	 * Intent, used for starting the {@link LadderActivity}.
	 */		
	public final static Intent LADDER_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.LADDER_ACTIVITY");
	
		       /**
	 * Intent, used for starting the {@link MultiplayerGameLobbyActivity}.
	 */		
	public final static Intent MULTIPLAYER_GAME_LOBBY_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.MULTIPLAYER_GAME_LOBBY_ACTIVITY");
	
	 /**
	 * Intent, used for starting the {@link SplashScreenActivity}.
	 */		
	public final static Intent SPLASH_SCREEN_ACTIVITY_INTENT = new Intent("com.navalbattle.controller.SPLASH_SCREEN_ACTIVITY");
	

}
