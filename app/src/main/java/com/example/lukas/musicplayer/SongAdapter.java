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
 * Created by Lukas on 28.02.18.
 */

public class SongAdapter extends ArrayAdapter<Song>{

    private static class ViewHolder{
        public TextView tvTitle;
        public TextView tvIinterpreter;
    }

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Song song = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_itemsong, parent, false);
            viewHolder.tvTitle = (TextView)convertView.findViewById(R.id.tvTitle);
            viewHolder.tvIinterpreter = (TextView)convertView.findViewById(R.id.tvInterpreter);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.tvTitle.setText(song.getTitle());
        viewHolder.tvIinterpreter.setText(song.getInterpreter());
        return convertView;
    }
}
