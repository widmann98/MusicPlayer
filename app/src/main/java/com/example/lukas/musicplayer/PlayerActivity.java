package com.example.lukas.musicplayer;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.ImageButton;
import android.util.AttributeSet;

/**
 * Created by Lukas on 14.03.18.
 */

public class PlayerActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        final MediaPlayer x;
        x = MediaPlayer.create(PlayerActivity.this, R.raw.evidence );

        ImageButton play_pause = (ImageButton) findViewById(R.id.play_pause);
        play_pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                x.start();
            }
        });
        ImageButton next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });
        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });



    }



}
