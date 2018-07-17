package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }


        Song currentWord = getItem(position);


        TextView songName = listItemView.findViewById(R.id.songName);

        songName.setText(currentWord.getSongName());


        TextView artistName = listItemView.findViewById(R.id.artistName);

        artistName.setText(currentWord.getArtistName());


        return listItemView;
    }
}
