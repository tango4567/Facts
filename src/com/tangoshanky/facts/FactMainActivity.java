package com.tangoshanky.facts;

import com.tangoshanky.torch.TourchActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FactMainActivity extends Activity{

	Button tourchbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fact_main);
		addListenerOnButton();
	}
	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		final Context context = this;
		tourchbtn = (Button)findViewById(R.id.torchbtn);
		tourchbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, TourchActivity.class);
				startActivity(intent);
			}
		});
	}
}
