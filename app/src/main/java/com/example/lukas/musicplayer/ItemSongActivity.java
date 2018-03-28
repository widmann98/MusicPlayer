package com.example.lukas.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.text.format.DateFormat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.widget.Button;

import java.util.ArrayList;


import java.util.ArrayList;

public class ItemSongActivity extends AppCompatActivity {

    private ListView listView;
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songlist);

        listView = (ListView)findViewById(R.id.songlistList);
        ArrayList<Song> songs = new ArrayList<>();

        songAdapter = new SongAdapter(this, songs);
        listView.setAdapter(songAdapter);

    }

}
