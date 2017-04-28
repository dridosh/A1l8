package ru.rsfera.a1l8.fragments;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import ru.rsfera.a1l8.R;
import ru.rsfera.a1l8.datamodule.Exercise;

public class ExerciseListFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] titles;
        titles = new String[Exercise.exercises.length];
        for (int i = 0; i < Exercise.exercises.length; i++) {
            titles[i] = getString(Exercise.exercises[i].getTitleID());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_activated_1 , titles);
       // android.R.layout.android.simple_expandable_list_item_1
        setListAdapter(adapter);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exercise_list, null);

    }


}
