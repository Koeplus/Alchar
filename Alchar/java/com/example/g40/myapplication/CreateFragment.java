package com.example.g40.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class CreateFragment extends Fragment {
    private static final String TAG = CreateFragment.class.getSimpleName();

    CardView mCardView;
    SeekBar mRadiusSeekBar;

    public static  CreateFragment newInstance(){
        CreateFragment fragment = new CreateFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }

    public CreateFragment() {
    }
    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_create, container, false);
    }
}