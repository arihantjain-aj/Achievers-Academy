package com.example.achieversacademy;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class notes extends Fragment {

    private WebView webView;
    public notes() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notes, container, false);

        webView = view.findViewById(R.id.webView);

        Intent intent = new Intent(getActivity(),web.class);
        intent.putExtra("url","https://cstutorialpoint.com/computer-science-notes");
        startActivity(intent);

            return view;
            
    }



}
