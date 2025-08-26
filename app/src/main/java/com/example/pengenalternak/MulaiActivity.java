package com.example.pengenalternak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MulaiActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);

        pindah = (ImageButton) findViewById(R.id.angsa);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, AngsaActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.ayam);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, AyamActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.bebek);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, BebekActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.kambing);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, KambingActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.kuda);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, KudaActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.sapi);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, SapiActivity.class);
                startActivity(intent);
            }
        });
    }
}
