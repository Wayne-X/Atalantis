package com.example.volumeup;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FrontPageFragment extends Fragment
{
	public interface FrontPageListener
	{
		public void getGoals(); 
	}
	
	private FrontPageListener listener;
	private Button goal1;
	
	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		listener = (FrontPageListener) activity;
	}
	
	@Override
	public void onDetach()
	{
		super.onDetach();
		listener = null;
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.front_page, container, false);
		
		goal1 = (Button) view.findViewById(R.id.goal1);
		goal1.setText("3 Miles"); 
		
		setHasOptionsMenu(true);
		
		goal1.setOnClickListener(goalsListener);
		
		return view;
	}
	
	
	private OnClickListener goalsListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			listener.getGoals();
		}
	};
	
}
