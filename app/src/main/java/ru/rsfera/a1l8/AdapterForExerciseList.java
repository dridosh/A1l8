package ru.rsfera.a1l8;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class AdapterForExerciseList extends BaseAdapter {
    private final Activity context;
    private final String[] itemTimes;
    private final String[] itemNames;
    private final int[] imgIDs;
    private final int[] progress;


    public AdapterForExerciseList(Activity context, String[] itemTimes, String[] itemNames,
                                  int[] imgIDs, int[] progress) {
        this.context = context;
        this.itemTimes = itemTimes;
        this.itemNames = itemNames;
        this.imgIDs = imgIDs;
        this.progress=progress;

    }


    @Override
    public int getCount() {
        return itemNames.length;
    }

    @Override
    public Object getItem(int position) {
        return itemNames[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.exercise_list_item, null, true);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageId);
        TextView timeTextView = (TextView) view.findViewById(R.id.timeID);
        TextView titleTextView = (TextView) view.findViewById(R.id.titleID);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        timeTextView.setText(itemTimes[position]);
        titleTextView.setText(itemNames[position]);
        imageView.setImageResource(imgIDs[position]);
        progressBar.setProgress(progress[position]);

        return view;
    }

//    public void sepProgress(int position, int val){
//
//
//
//    }
}
