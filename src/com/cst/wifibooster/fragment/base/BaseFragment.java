package com.cst.wifibooster.fragment.base;

import com.cst.wifibooster.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaseFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = createView(inflater, container, savedInstanceState);
		
		initViews(rootView);
		initData(rootView);
		bindActions(rootView);
		
		return rootView;
	}

	/**
	 * create view for framgent
	 * @param inflater
	 * @param container
	 * @param savedInstanceState
	 * @return
	 */
	protected View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return null;
	}
	
	/**
	 * init view of this framgent
	 * @param rootView
	 */
	protected void initViews(View rootView){
	}
	
	/**
	 * init data of this framgent
	 * @param rootView
	 */
	protected void initData(View rootView){
	}
	
	/**
	 * bind actions for this framgent
	 * @param rootView
	 */
	protected void bindActions(View rootView){
	}
	
	@Override
	public void startActivity(Intent intent) {
		getActivity().startActivity(intent);
	}
	
	@Override
	public void startActivityForResult(Intent intent, int requestCode) {
		getActivity().startActivityForResult(intent, requestCode);
	}
}
