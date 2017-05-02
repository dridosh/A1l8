package ru.rsfera.a1l8;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


public class AdapterForExerciseList extends BaseAdapter {
    private final Activity context;
    private final String[] itemNames;
    private final Integer[] imgIDs;

    public AdapterForExerciseList(Activity context, String[] itemNames, Integer[] imgIDs) {
        this.context = context;
        this.itemNames = itemNames;
        this.imgIDs = imgIDs;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.exercise_list_item, null, true);

        return null;
    }
}
