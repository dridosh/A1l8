package ru.rsfera.a1l8.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.rsfera.a1l8.R;
import ru.rsfera.a1l8.datamodule.Stopwatch;


public class ExerciseStopwatchFragment extends Fragment {


    TextView textView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Stopwatch.runTimer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        textView = (TextView) getActivity().findViewById(R.id.tv_stop_watch);

        return inflater.inflate(R.layout.fragment_exercise_stopwatch, container, false);
    }

//    @Override
//    public void onStopwatchTact() {
//        Log.d("98765", "onStopwatchTact: ");
//        Stopwatch.getMs();
//
//        int hours = Stopwatch.getMs() / 3600;
//        int minutes = (Stopwatch.getMs() % 3600) / 60;
//        int secs = Stopwatch.getMs() % 60;
//        String time = String.format("%d:%02d:%02d", hours, minutes, secs);
//        textView.setText(time);
//
//    }

}
