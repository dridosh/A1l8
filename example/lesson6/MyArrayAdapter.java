package com.example.lesson6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyArrayAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public MyArrayAdapter(Activity context, String[] itemname, Integer[] imgid) {
        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

	@Override
	public int getCount() {
		return itemname.length;
	}

	@Override
	public Object getItem(int position) {
		return itemname[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View myView = inflater.inflate(R.layout.my_list_item, null, true);//лейаут для элемента списка

        //Элементы лейаута
        TextView textView = (TextView) myView.findViewById(R.id.name);
        ImageView imageView = (ImageView) myView.findViewById(R.id.imageResourceId);

        //сеттим значения
        textView.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return myView;
    }
}

