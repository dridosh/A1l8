package com.example.lesson6;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ServicesCategoryActivity extends ListActivity {

	public static final String HAIR = "hair";

	public enum Type {
		HAIR,
		NAILS
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ListView listNails = getListView();
//		if ((TopActivity.service).equals("hair")) {
//			ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, R.layout.my_list_item, getStringArray(Services.hairs));
//			listNails.setAdapter(listAdapter);
//		} else if ((TopActivity.service).equals("nail")) {
//			ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, R.layout.my_list_item, getStringArray(Services.nails));
//			listNails.setAdapter(listAdapter);
//		}

		if ((TopActivity.service).equals(HAIR)) {
			MyArrayAdapter listAdapter = new MyArrayAdapter(this, getStringArray(Services.hairs),
					getImageId(Services.hairs));
			listNails.setAdapter(listAdapter);
		} else if ((TopActivity.service).equals("nail")) {
			MyArrayAdapter listAdapter = new MyArrayAdapter(this, getStringArray(Services.nails),
					getImageId(Services.nails));
			listNails.setAdapter(listAdapter);
		}
	}

	@Override
	public void onListItemClick(ListView listView, View itemView, int position, long id) {
//		Log.d("ServicesCategoryActivity", "listView " + listView);
//		Log.d("ServicesCategoryActivity", "itemView " + itemView);
//		Log.d("ServicesCategoryActivity", "position " + position);
//		Log.d("ServicesCategoryActivity", "id " + id);
		Intent intent = new Intent(ServicesCategoryActivity.this, ServicesActivity.class);
		intent.putExtra(ServicesActivity.EXTRA_NAILNOM, (int) id);
		startActivity(intent);
	}

	private String[] getStringArray(Services[] services) {
		int count = services.length;
		String[] array = new String[count];
		for (int i = 0; i < count; i++) {
			array[i] = getResources().getString(services[i].getName());
		}
		return array;
	}

	private Integer[] getImageId(Services[] services) {
		int count = services.length;
		Integer[] array = new Integer[count];
		for (int i = 0; i < count; i++) {
			array[i] = services[i].getImageResourceId();
		}
		return array;
	}


}
