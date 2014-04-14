package com.cst.wifibooster.adapter;

import java.util.Locale;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cst.wifibooster.R;
import com.cst.wifibooster.fragment.HardwareBoosterFragment;
import com.cst.wifibooster.fragment.SystemClearupFragment;
import com.cst.wifibooster.fragment.WifiBoosterFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private Context mContext;

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = null;
		switch(position){
		case 0:
			fragment = new WifiBoosterFragment();
			break;
		case 1:
			fragment = new HardwareBoosterFragment();
			break;
		case 2:
			fragment = new SystemClearupFragment();
			break;
		}
		return fragment;
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return mContext.getResources().getString(R.string.title_section1).toUpperCase(l);
		case 1:
			return mContext.getResources().getString(R.string.title_section2).toUpperCase(l);
		case 2:
			return mContext.getResources().getString(R.string.title_section3).toUpperCase(l);
		}
		return null;
	}
}