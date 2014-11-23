package com.example.volumeup;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginFragment extends Fragment {
	
	public interface LoginFragmentListener
	{
		public void getGoals();
	}
	
	// Variables
	private LoginFragmentListener listener;
	
	private EditText address;
	private EditText username;
	private EditText password;
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
		username = (EditText) view.findViewById(R.id.username_EditText);
		password = (EditText)view.findViewById(R.id.password_EditText);
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
	
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		listener = (LoginFragmentListener) activity;
	}
	
	public void onDetach()
	{
		super.onDetach();
		listener = null; 
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
