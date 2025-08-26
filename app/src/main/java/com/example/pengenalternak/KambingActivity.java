package com.example.pengenalternak;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class KambingActivity extends AppCompatActivity {
    MediaPlayer hewan, eng, id, pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kambing);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void kambing(View v) {
        if (hewan == null) {
            hewan = MediaPlayer.create(this, R.raw.kambing);
        }
        hewan.start();
    }

    public void union(View v) {
        if (eng == null) {
            eng = MediaPlayer.create(this, R.raw.goat);
        }
        eng.start();
    }

    public void indonesia(View v) {
        if (id == null) {
            id = MediaPlayer.create(this, R.raw.s_kambing);
        }
        id.start();
    }

    public void play(View v) {
        if (pay == null) {
            pay = MediaPlayer.create(this, R.raw.gabkambing);
        }
        pay.start();

    }

}
