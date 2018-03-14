package com.example.lukas.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lukas on 14.03.18.
 */

public class PlaylistAdapter extends ArrayAdapter<Playlist>{

    private static class ViewHolder{
        public TextView playlist_name;
    }
    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<Playlist> playlists) {
        super(context, resource, playlists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Playlist playlist = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_itemplaylist, parent, false);
            viewHolder.playlist_name = (TextView) convertView.findViewById(R.id.playlist_name);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.playlist_name.setText(playlist.getPlaylist_name());
        return convertView;
    }
}
