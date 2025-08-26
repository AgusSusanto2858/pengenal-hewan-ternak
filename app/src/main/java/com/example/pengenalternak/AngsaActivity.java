package com.example.pengenalternak;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class AngsaActivity extends AppCompatActivity {
    MediaPlayer hewan, eng, id, pay;
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angsa);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void angsa(View v) {
        if (hewan == null) {
            hewan = MediaPlayer.create(this, R.raw.angsa);
        }
        hewan.start();
    }

    public void union(View v) {
        if (eng == null) {
            eng = MediaPlayer.create(this, R.raw.goose);
        }
        eng.start();
    }

    public void indonesia(View v) {
        if (id == null) {
            id = MediaPlayer.create(this, R.raw.s_angsa);
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
