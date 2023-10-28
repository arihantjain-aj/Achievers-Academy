package com.example.achieversacademy;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class tutFragment extends Fragment {

    ImageButton android,c,cplus,csharp,css,html,java,js,php,python,linux;
    String[] urls = new String[11];
    public tutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tut, container, false);

        ImageButton c=view.findViewById(R.id.imageButton);
        ImageButton cplus=view.findViewById(R.id.imageButton2);
        ImageButton android=view.findViewById(R.id.imageButton3);
        ImageButton csharp=view.findViewById(R.id.imageButton4);
        ImageButton html=view.findViewById(R.id.imageButton5);
        ImageButton css=view.findViewById(R.id.imageButton6);
        ImageButton js=view.findViewById(R.id.imageButton7);
        ImageButton java=view.findViewById(R.id.imageButton8);
        ImageButton php=view.findViewById(R.id.imageButton9);
        ImageButton linux=view.findViewById(R.id.imageButton10);
        ImageButton python=view.findViewById(R.id.imageButton11);

        urls[0]="https://www.tutorialspoint.com/android/android_overview.htm";
        urls[1]="https://www.geeksforgeeks.org/c-language-introduction/?ref=lbp";
        urls[2]="https://www.w3schools.com/cpp/cpp_intro.asp";
        urls[3]="https://learn.microsoft.com/en-us/dotnet/csharp/tour-of-csharp/";
        urls[4]="https://www.w3schools.com/css/css_intro.asp";
        urls[5]="https://www.w3schools.com/html/html_intro.asp";
        urls[6]="https://www.javatpoint.com/java-tutorial";
        urls[7]="https://www.javatpoint.com/javascript-tutorial";
        urls[8]="https://www.guru99.com/unix-linux-tutorial.html";
        urls[9]="https://www.phptutorial.net/";
        urls[10]="https://www.tutorialspoint.com/python/index.htm";

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[0]);
                startActivity(intent);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[1]);
                startActivity(intent);
            }
        });

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[2]);
                startActivity(intent);
            }
        });

        csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[3]);
                startActivity(intent);
            }
        });

        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[4]);
                startActivity(intent);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[5]);
                startActivity(intent);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[6]);
                startActivity(intent);
            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[7]);
                startActivity(intent);
            }
        });

        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[8]);
                startActivity(intent);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[9]);
                startActivity(intent);
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),web.class);
                intent.putExtra("url",urls[10]);
                startActivity(intent);
            }
        });

        return view;

    }

}