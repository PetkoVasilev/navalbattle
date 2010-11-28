/**
 * 
 */
package com.navalbattle.controller;

import java.util.Observable;
import java.util.Observer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.navalbattle.R;
import com.navalbattle.model.MainMenuModel;
import com.navalbattle.model.interfaces.IMainMenuModel;

/**
 * Activity representing the Main Menu of the Naval Battle game
 * 
 * @author Administrator
 */
public class MainMenuActivity extends Activity implements Observer,
		OnClickListener {

	private IMainMenuModel model;

	/**
	 * 
	 */
	public MainMenuActivity() {
		model = new MainMenuModel();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		model.addObserver(this);

		setContentView(R.layout.main_menu_layout);

		ListView mainMenu = (ListView) findViewById(R.id.main_menu);

		mainMenu.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,
				model.getMainMenuItems()));
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		model.deleteObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
