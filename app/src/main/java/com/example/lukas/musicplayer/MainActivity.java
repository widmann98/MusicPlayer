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

        Button songs = (Button) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sett = new Intent(MainActivity.this, SongActivity.class);
                MainActivity.this.startActivity(sett);
            }
        });
        Button playlist = (Button) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sett = new Intent(MainActivity.this, PlaylistActivity.class);
                MainActivity.this.startActivity(sett);
            }
        });



    }
}
