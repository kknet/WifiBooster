package com.cst.wifibooster.activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import com.cst.wifibooster.R;
import com.cst.wifibooster.activity.base.BaseFragmentActivity;

/**
 * Wifi加速页面
 * @author MonsterStorm
 * 
 */
public class WifiBoosterActivity extends BaseFragmentActivity {

	private ActionBar mActionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wifi_booster);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				finish();
			}
		}, 5000);
	}

	@Override
	protected void initViews() {
		super.initViews();
	}

	@Override
	protected void initActionBar() {
		super.initActionBar();
		mActionBar = getActionBar();
		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
