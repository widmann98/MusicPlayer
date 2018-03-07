package com.example.lukas.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button main_song = (Button) findViewById(R.id.main_song);
        main_song.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ItemSongActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        Button main_playlist = (Button) findViewById(R.id.main_playlist);
        main_playlist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sett = new Intent(MainActivity.this, ItemPlaylistActivity.class);
                MainActivity.this.startActivity(sett);
            }
        });


    }
}
