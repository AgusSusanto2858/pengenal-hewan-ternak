package com.example.pengenalternak;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class BebekActivity extends AppCompatActivity {
    MediaPlayer hewan, eng, id, pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebek);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void bebek(View v) {
        if (hewan == null) {
            hewan = MediaPlayer.create(this, R.raw.bebek);
        }
        hewan.start();
    }

    public void union(View v) {
        if (eng == null) {
            eng = MediaPlayer.create(this, R.raw.duck);
        }
        eng.start();
    }

    public void indonesia(View v) {
        if (id == null) {
            id = MediaPlayer.create(this, R.raw.s_bebek);
        }
        id.start();
    }

    public void play(View v) {
        if (pay == null) {
            pay = MediaPlayer.create(this, R.raw.gabangsa);
        }
        pay.start();

    }
}
