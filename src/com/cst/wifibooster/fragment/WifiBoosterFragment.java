package com.cst.wifibooster.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.cst.stormdroid.utils.intent.IntentHelper;
import com.cst.wifibooster.R;
import com.cst.wifibooster.activity.WifiBoosterActivity;
import com.cst.wifibooster.fragment.base.BaseFragment;

/**
 * Wifi加速
 * @author MonsterStorm
 * 
 */
public class WifiBoosterFragment extends BaseFragment implements OnClickListener {

	private View mWifiBooster;

	public WifiBoosterFragment() {
	}

	@Override
	protected View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_wifi_booster, container, false);
	}

	@Override
	protected void initViews(View rootView) {
		mWifiBooster = rootView.findViewById(R.id.btnBooster);
	}

	@Override
	protected void bindActions(View rootView) {
		mWifiBooster.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnBooster:
			startActivity(IntentHelper.newIntent(getActivity(), WifiBoosterActivity.class));
			break;
		default:
			break;
		}
	}
}
