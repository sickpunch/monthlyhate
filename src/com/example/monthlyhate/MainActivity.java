package com.example.monthlyhate;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.view.View;

public class MainActivity extends Activity {
	
	private DatePicker dp;
	private Button select;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//addBtnListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	
	public void addBtnListener()
	{
		//select = (Button) findViewById(R.id.btnChangeDate);
		 
		select.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
 
		});
	}

}
