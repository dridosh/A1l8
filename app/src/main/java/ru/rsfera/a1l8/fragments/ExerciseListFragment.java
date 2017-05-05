package ru.rsfera.a1l8.fragments;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ru.rsfera.a1l8.AdapterForExerciseList;
import ru.rsfera.a1l8.R;
import ru.rsfera.a1l8.datamodule.Exercise;

public class ExerciseListFragment extends ListFragment {

    AdapterForExerciseList adapter;
    int[] progress;
    ListView list;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] exercisesTime;
        exercisesTime = new String[Exercise.exercises.length];
        for (int i = 0; i <  Exercise.exercises.length; i++) {
            int minutes = (Exercise.exercises[i].getExerciseTimeSecond() % 3600) / 60;
            int secs = Exercise.exercises[i].getExerciseTimeSecond() % 60;
            exercisesTime[i]=  String.format("%02d:%02d", minutes, secs);
        }



        String[] exercisesTitle;
        exercisesTitle = new String[Exercise.exercises.length];
        for (int i = 0; i < Exercise.exercises.length; i++) {
            exercisesTitle[i] = getString(Exercise.exercises[i].getTitleID());
        }

        int[] exercisesImage;
        exercisesImage = new int[Exercise.exercises.length];
        for (int i = 0; i < Exercise.exercises.length; i++) {
            exercisesImage[i] = Exercise.exercises[i].getImageOnListID();

        }
        progress = new int[Exercise.exercises.length];
        for (int i = 0; i < Exercise.exercises.length; i++) {
            progress[i]=0;
        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
//                android.R.layout.simple_list_item_activated_1 , exercisesTitle);
       // android.R.layout.android.simple_expandable_list_item_1

        adapter =new AdapterForExerciseList (getActivity(),
                exercisesTime, exercisesTitle, exercisesImage,progress);

        setListAdapter(adapter);
        list=getListView();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         return inflater.inflate(R.layout.fragment_exercise_list, null);

    }

    @Override
    public void onStart() {
        super.onStart();
        runTimer();
    }

    private void runTimer() {
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
              if (progress[0] <100) {progress[0]++;}
               adapter.notifyDataSetChanged();

           //    if (getListView() !=null){
          //         setSelection(5);
           //    }

            //    setSelection(getSelectedItemPosition()+1);
            //    Log.d("22222222", "run: "+getSelectedItemPosition());

              // list.setSelection();

               handler.postDelayed(this, 1000);
            }
        });
    }

}