/**
 * 
 */
package com.navalbattle.controller;

import java.util.Observable;
import java.util.Observer;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.navalbattle.R;
import com.navalbattle.model.data.Intents;

/**
 * Activity representing the Main Menu of the Naval Battle game
 * 
 * @author Administrator
 */
public class MainMenuActivity extends Activity implements Observer,
		OnClickListener {
	private ListView mainMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_menu_layout);

		mainMenu = (ListView) findViewById(R.id.main_menu);
		mainMenu.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, this.getResources()
						.getStringArray(R.array.main_menu_items)));

		mainMenu.setOnItemClickListener(menuItemClicked);

	}

	@Override
	protected void onResume() {
		super.onResume();

	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			if (keyCode == KeyEvent.KEYCODE_BACK) {
				finish();
				return false;
			}
		}
		return super.onKeyDown(keyCode, event);
	}

	private final OnItemClickListener menuItemClicked = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> adapter, View view, int index,
				long arg) {
			startActivity(Intents.LADDER_ACTIVITY_INTENT);
		}
	};

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

}
