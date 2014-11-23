package com.example.volumeup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentFragment extends Fragment
{
	public interface PaymentFragmentListener
	{
		
	}
	
	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.payment, container, false);
		setHasOptionsMenu(true); 
		
		return view;
	}
}
