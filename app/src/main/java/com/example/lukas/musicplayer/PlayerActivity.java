package com.example.lukas.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;

/**
 * Created by Lukas on 14.03.18.
 */

public class PlayerActivity extends AppCompatActivity{
    static boolean st_ps = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);


        final MediaPlayer x;
        x = MediaPlayer.create(PlayerActivity.this, R.raw.evidence);

        final ImageButton play_pause = (ImageButton) findViewById(R.id.play_pause);
        play_pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (st_ps==true) {
                    x.start();
                    st_ps = false;

                }
                else {
                    x.pause();
                    st_ps = true;
                }

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
