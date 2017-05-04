package ru.rsfera.a1l8.datamodule;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import ru.rsfera.a1l8.MainActivity;
import ru.rsfera.a1l8.fragments.ExerciseStopwatchFragment;


public class Stopwatch {

    private static Stopwatch stopwhatch;
    private static int ms=0;
    private boolean isRunning = true;


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



    private Stopwatch(){


    }
    public static void runTimer() {
        if (stopwhatch == null) {
            stopwhatch = new Stopwatch();

            stopwhatch.runing();
        }
    }

     private void  runing(){
     final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                ms++;
//              //  if (ms%100==0){
//                if (listener !=null) {
//                    listener.onItemClicked(1);
//                }
                Log.d("1234567", "run:listner.onStopwatchTact ");
                handler.postDelayed(this, 1000);
            }
        });
    }


}
