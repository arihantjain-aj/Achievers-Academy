package com.example.achieversacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class abtus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abtus);

        ImageButton linkButton = findViewById(R.id.imageBtn);

        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkWithChooser();
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, navi.class);
        startActivity(intent);
        finish();
    }

    private void openLinkWithChooser() {
        // The URL you want to open
        String urlToOpen = "https://www.linkedin.com/in/arihant-jain-5bbbb2278?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app";

        // Create an implicit intent to view the URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlToOpen));
        intent.putExtra("url",urlToOpen);
        startActivity(intent);
    }
}
