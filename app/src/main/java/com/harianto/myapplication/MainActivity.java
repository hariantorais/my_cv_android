package com.harianto.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnHubungi;
    private Button btnProfile;
    private Button btnPendidikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfile = findViewById(R.id.btn_profil);
        btnHubungi = findViewById(R.id.btn_hubungi);
        btnPendidikan = findViewById(R.id.btn_pendidikan);

        // intent ke profile
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profile);
            }
        });

        // intent ke riwyat pendidikan
        btnPendidikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pendidikan = new Intent(MainActivity.this, PendidikanActivity.class);
                startActivity(pendidikan);
            }
        });

        // intent ke hubungi
        btnHubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hubungi = new Intent(MainActivity.this, HubungiActivity.class);
                startActivity(hubungi);
            }
        });


    }

}