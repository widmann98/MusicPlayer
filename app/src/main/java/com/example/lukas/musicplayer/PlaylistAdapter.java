package com.example.lukas.musicplayer;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lukas on 07.03.18.
 */

public class PlaylistAdapter extends ArrayList<Playlist> {

    private static class ViewHolder{
        public TextView playlist_name;
    }
    public PlaylistAdapter(@NonNull Context context, ArrayList<Playlist> playlists){
        super(Context,playlists);
    }
}
