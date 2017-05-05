package ru.rsfera.a1l8.datamodule;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

import ru.rsfera.a1l8.MainActivity;
import ru.rsfera.a1l8.fragments.ExerciseStopwatchFragment;


public class Stopwatch {

    private static Stopwatch stopwhatch;
    private static int ms=0;
    private boolean isRunning = true;

    private StopwatchListener listener;

    public interface StopwatchListener{
        void onTact();
    }




    public static int getMs() {
        return ms;
    }


    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void reset(){
        ms=0;
    }



    private Stopwatch(Fragment fragment){
        listener= (StopwatchListener) fragment;



    }
    public static void runTimer(Fragment fragment) {
        if (stopwhatch == null) {
            stopwhatch = new Stopwatch(fragment);

            stopwhatch.runing();
        }
    }

     private void  runing(){
     final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                ms++;
              //  if (ms%100==0){
                if (listener !=null) {
                    listener.onTact();
                }
                Log.d("1234567", "run:listner.onStopwatchTact ");
                handler.postDelayed(this, 1000);
            }
        });
    }


}
