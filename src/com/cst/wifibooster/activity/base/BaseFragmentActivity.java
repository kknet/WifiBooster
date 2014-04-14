package com.cst.wifibooster.activity.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.cst.wifibooster.R;

public class BaseFragmentActivity extends FragmentActivity {

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		initViews();
		initActionBar();
		initData();
		bindActions();
	}

	/**
	 * init views for this activity
	 */
	protected void initViews() {
	}

	/**
	 * init actionbar for this activity
	 */
	protected void initActionBar() {
	}

	/**
	 * initData for this activity
	 */
	protected void initData() {
	}

	/**
	 * bind actions for this activity
	 */
	protected void bindActions() {
	}

	@Override
	public void finish() {
		super.finish();
		this.overridePendingTransition(R.anim.anim_slide_left_in, R.anim.anim_slide_right_out);
	}
	
	@Override
	public void startActivity(Intent intent) {
		super.startActivity(intent);
		this.overridePendingTransition(R.anim.anim_slide_right_in, R.anim.anim_slide_left_out);
	}
	
	@Override
	public void startActivityForResult(Intent intent, int requestCode) {
		super.startActivityForResult(intent, requestCode);
		this.overridePendingTransition(R.anim.anim_slide_right_in, R.anim.anim_slide_left_out);
	}
}
