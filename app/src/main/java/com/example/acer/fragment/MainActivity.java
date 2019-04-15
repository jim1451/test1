package com.example.acer.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    private FragmentTransaction  transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        LeftFragment leftFragment = new LeftFragment();
        transaction.add(R.id.left,leftFragment,"leftFragment");
        transaction.commit();

    }
	
	private  void  tets|()
	{
		
	}
