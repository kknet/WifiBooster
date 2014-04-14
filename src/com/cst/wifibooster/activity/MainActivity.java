package com.cst.wifibooster.activity;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.widget.Toast;

import com.cst.wifibooster.R;
import com.cst.wifibooster.activity.base.BaseFragmentActivity;
import com.cst.wifibooster.adapter.SectionsPagerAdapter;

public class MainActivity extends BaseFragmentActivity implements ActionBar.TabListener {

	SectionsPagerAdapter mSectionsPagerAdapter;

	ViewPager mViewPager;

	private ActionBar mActionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void initViews() {
		super.initViews();
		mViewPager = (ViewPager) findViewById(R.id.pager);
	}

	@Override
	protected void initActionBar() {
		super.initActionBar();
		mActionBar = getActionBar();
		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	}

	@Override
	protected void initData() {
		super.initData();
		mSectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
		mViewPager.setAdapter(mSectionsPagerAdapter);

		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			mActionBar.addTab(mActionBar.newTab().setText(mSectionsPagerAdapter.getPageTitle(i)).setTabListener(this));
		}
	}

	@Override
	protected void bindActions() {
		super.bindActions();
		mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
			@Override
			public void onPageSelected(int position) {
				mActionBar.setSelectedNavigationItem(position);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onTabSelected(Tab tab, android.app.FragmentTransaction ft) {
		if(tab != null){
			mViewPager.setCurrentItem(tab.getPosition());
		}
	}

	@Override
	public void onTabUnselected(Tab tab, android.app.FragmentTransaction ft) {
	}

	@Override
	public void onTabReselected(Tab tab, android.app.FragmentTransaction ft) {
	}
}
