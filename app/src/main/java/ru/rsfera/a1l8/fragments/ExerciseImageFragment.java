package ru.rsfera.a1l8.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.rsfera.a1l8.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExerciseImageFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exercise_image, container, false);
    }

}
