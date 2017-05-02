package com.example.lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TopActivity extends AppCompatActivity implements View.OnClickListener {

	public static final String HAIR = "hair";
	private View hairView;
	private View nailView;
	private View addressView;

	public static String service = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_top);
		hairView = findViewById(R.id.hair);
		nailView = findViewById(R.id.nail);
		addressView = findViewById(R.id.address);
		hairView.setOnClickListener(this);
		nailView.setOnClickListener(this);
		addressView.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if (view.equals(hairView)) {
			service = HAIR;
			Intent intentServices = new Intent(this, ServicesCategoryActivity.class);

			startActivity(intentServices);
		}
		if (view.equals(nailView)){
			service = "nail";
			Intent intentServices = new Intent(this, ServicesCategoryActivity.class);
			startActivity(intentServices);
		}
		if (view.equals(addressView)){
			Intent intentAddress = new Intent(this, AddressActivity.class);
			startActivity(intentAddress);
		}
	}

}

