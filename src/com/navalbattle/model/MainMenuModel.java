package com.navalbattle.model;

import java.util.Observable;

import android.content.res.Resources;

import com.navalbattle.NavalBattleApp;
import com.navalbattle.R;
import com.navalbattle.controller.MainMenuActivity;
import com.navalbattle.model.interfaces.IMainMenuModel;

/**
 * The underlying model for {@link MainMenuActivity}
 * 
 * @author Administrator
 * 
 */
public class MainMenuModel extends Observable implements IMainMenuModel{

	private String[] mainMenuItems;

	/**
	 * Constructor
	 */
	public MainMenuModel() {
		final Resources res = NavalBattleApp.getContext().getResources();
		mainMenuItems = res.getStringArray(R.array.main_menu_items);
	}

	@Override
	public String[] getMainMenuItems() {
		return mainMenuItems;
	}

	public void setMainMenuItems(String[] mainMenuItems) {
		this.mainMenuItems = mainMenuItems;
	}
}
