package com.example.lukas.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lukas on 28.02.18.
 */

public class SongAdapter extends ArrayAdapter<Song>{

    private static class ViewHolder{
        public TextView title;
        public TextView interpreter;
    }





    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
}
