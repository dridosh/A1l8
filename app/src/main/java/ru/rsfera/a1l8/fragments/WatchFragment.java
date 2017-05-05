package ru.rsfera.a1l8.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.rsfera.a1l8.R;
import ru.rsfera.a1l8.datamodule.Stopwatch;

public class WatchFragment extends Fragment implements Stopwatch.StopwatchListener{

    TextView textView;
    Stopwatch stopwatch;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        stopwatch = Stopwatch.getStopwatch(this);
        View layout = inflater.inflate(R.layout.fragment_watch,container,false);
        textView = (TextView) layout.findViewById(R.id.tv_watch);
        return layout;
    }

    @Override
    public void onTact() {
        int itime= stopwatch.getMs();

        int hours = itime / 3600;
        int minutes = (itime % 3600) / 60;
        int secs = itime % 60;

        String stime = String.format("%d:%02d:%02d", hours, minutes, secs);
        Log.d("55555", "onStopwatchTact: "+stime);

        textView.setText(stime);

    }
}
