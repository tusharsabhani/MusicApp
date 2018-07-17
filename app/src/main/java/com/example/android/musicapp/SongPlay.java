package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SongPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);
    }
    public void shuffle(View view){
        Toast.makeText(this,"Shuffling songs",Toast.LENGTH_SHORT).show();
    }

    public void previous(View view){
        Toast.makeText(this,"Playing previous song",Toast.LENGTH_SHORT).show();
    }

    public void play(View view){
        Toast.makeText(this,"Playing your song",Toast.LENGTH_SHORT).show();
    }

    public void next(View view){
        Toast.makeText(this,"Playing next song",Toast.LENGTH_SHORT).show();
    }

    public void addToPlaylist(View view){
        Toast.makeText(this,"Adding this song to your playlist",Toast.LENGTH_SHORT).show();
    }
}
