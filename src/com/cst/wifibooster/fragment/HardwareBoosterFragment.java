package com.cst.wifibooster.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

import com.cst.stormdroid.utils.intent.IntentHelper;
import com.cst.wifibooster.R;
import com.cst.wifibooster.activity.GetPointActivity;
import com.cst.wifibooster.activity.WifiBoosterActivity;
import com.cst.wifibooster.fragment.base.BaseFragment;

/**
 * 硬件加速
 * @author MonsterStorm
 * 
 */
public class HardwareBoosterFragment extends BaseFragment implements OnClickListener {

	private View mGetPoint;

	public HardwareBoosterFragment() {
	}

	@Override
	protected View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_hardware_booster, container, false);
	}

	@Override
	protected void initViews(View rootView) {
		mGetPoint = rootView.findViewById(R.id.btnBooster);
	}

	@Override
	protected void bindActions(View rootView) {
		mGetPoint.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnBooster:
			startActivity(IntentHelper.newIntent(getActivity(), GetPointActivity.class));
			break;
		default:
			break;
		}
	}
}
