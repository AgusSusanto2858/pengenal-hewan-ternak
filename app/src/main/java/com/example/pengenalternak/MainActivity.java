package com.example.pengenalternak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);

        pindah = (ImageButton) findViewById(R.id.ButtonMulai);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MainActivity.this, MulaiActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.ButtonTentang);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.ButtonPetunjuk);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MainActivity.this, PetunjukActivity.class);
                startActivity(intent);
            }
        });
    }
}
