package com.example.volumeup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class InfoFragment extends Fragment
{
	public interface InfoFragmentListener
	{
		public void getGoals();
	}
	
	// Variables
	
	private InfoFragmentListener listener;
	
		private EditText address;
		private EditText city;
		private EditText state;
		private EditText zipCode;
		private EditText country;
		private EditText phone; 
		private Button submit; 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.login, container, false);
		address = (EditText)view.findViewById(R.id.address_EditText);
		city = (EditText)view.findViewById(R.id.city_EditText);
		state = (EditText)view.findViewById(R.id.state_EditText);
		zipCode = (EditText)view.findViewById(R.id.zip_EditText);
		country = (EditText)view.findViewById(R.id.country_EditText);
		phone = (EditText)view.findViewById(R.id.phone_EditText); 
		submit = (Button) view.findViewById(R.id.submitB); 
		
		submit.setOnClickListener(clickListener); 
		
		setHasOptionsMenu(true);
		
		return view;
	}
	
	private OnClickListener clickListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			listener.getGoals();
		}
	};

}
