package com.example.achieversacademy;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class aboutusFragment extends Fragment {

    public aboutusFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tut, container, false);
        Intent intent = new Intent(getActivity(), abtus.class);
        startActivity(intent);
        return view;
    }
}