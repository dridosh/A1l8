package ru.rsfera.a1l8.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import ru.rsfera.a1l8.R;
import ru.rsfera.a1l8.datamodule.Stopwatch;


public class ExerciseStopwatchFragment extends Fragment implements Stopwatch.StopwatchListener, View.OnClickListener{


    TextView textView;
    Stopwatch stopwatch;
    Button startStopButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        stopwatch = Stopwatch.getStopwatch(this);
        View layout = inflater.inflate(R.layout.fragment_exercise_stopwatch,container,false);
        textView = (TextView) layout.findViewById(R.id.tv_stop_watch);
        startStopButton = (Button) layout.findViewById(R.id.start_stop_button);
        startStopButton.setOnClickListener(this);

        return layout;//inflater.inflate(R.layout.fragment_exercise_stopwatch, container, false);
    }

    @Override
    public void onTact() {
        int itime= stopwatch.getMs();

        int hours = itime / 3600;
        int minutes = (itime % 3600) / 60;
        int secs = itime % 60;

        String stime = String.format("%d:%02d:%02d", hours, minutes, secs);
        Log.d("98765", "onStopwatchTact: "+stime);

        textView.setText(stime);

    }

    @Override
    public void onClick(View v) {
        if  (stopwatch.isRunning()) {
            stopwatch.stop();
        }
        else{
            stopwatch.start();
        }

    }

//    @Override
//    public void onStopwatchTact() {
//        Log.d("98765", "onStopwatchTact: ");
//        Stopwatch.getMs();
//

//        textView.setText(time);
//
//    }

}
