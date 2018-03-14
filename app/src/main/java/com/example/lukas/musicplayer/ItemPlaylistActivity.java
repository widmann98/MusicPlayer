package com.example.lukas.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ItemPlaylistActivity extends AppCompatActivity {

    private ListView listView;
    private PlaylistAdapter playlistAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        listView = (ListView)findViewById(R.id.playlist_list);
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlistAdapter = new PlaylistAdapter(this, playlists);
        listView.setAdapter(playlistAdapter);
    }
}
