package ru.rsfera.a1l8.datamodule;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;


public class Stopwatch {

    private static Stopwatch stopwatch;
    private int ms = 0;


    private boolean isRunning = true;

    private static StopwatchListener listener;

    public interface StopwatchListener {
        void onTact();
    }


    public int getMs() {
        return ms;
    }


    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void reset() {
        ms = 0;
    }

    public boolean isRunning() {
        return isRunning;
    }

    private Stopwatch() {

    }

    public static Stopwatch getStopwatch(Fragment fragment) {
        if (stopwatch == null) {
            synchronized (Stopwatch.class) {
                stopwatch = new Stopwatch();
                stopwatch.runing();
            }
        }

        if (stopwatch != null) {
            listener = (StopwatchListener) fragment;

        }
        return stopwatch;
    }

    private void runing() {
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (isRunning) ms++;;
                //  if (ms%100==0){
                if (listener != null) {
                    listener.onTact();
                }
                Log.d("1234567", "run:listner.onStopwatchTact ");
                handler.postDelayed(this, 1000);
            }
        });
    }


}
