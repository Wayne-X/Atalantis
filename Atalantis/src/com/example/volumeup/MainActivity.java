package com.example.volumeup;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity 
	implements FrontPageFragment.FrontPageListener,
			   InfoFragment.InfoFragmentListener,
			   RunningFragment.RunningFragmentListener,
			   LoginFragment.LoginFragmentListener,
			   PaymentFragment.PaymentFragmentListener
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		boolean existingAccount = true; 
		
		if (existingAccount == false)
		{
			LoginFragment fragment = new LoginFragment(); 
		}
		
		FrontPageFragment fragment = new FrontPageFragment();
		
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();
		transaction.add(R.id.fragmentContainer, fragment);
		transaction.commit(); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId())
		{
		case R.id.info:
			displayInfo(); 
			return true; 
		case R.id.payment: 
			displayPayment();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void displayInfo()
	{
		InfoFragment infofrag = new InfoFragment();
		
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.fragmentContainer, infofrag);
		transaction.commit(); 
	}
	
	public void displayPayment()
	{
		PaymentFragment paymentfrag = new PaymentFragment();
		
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.fragmentContainer, paymentfrag);
		transaction.commit(); 
	}
	
	public void getGoals()
	{
		RunningFragment runningfrag = new RunningFragment();
		
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.fragmentContainer, runningfrag);
		transaction.addToBackStack(null);
		transaction.commit(); 
	}
	
}
