package com.example.android.musicapp;

public class Song {

    private String songName;
    private String artistName;

    public Song(String song,String artist){
        songName = song;
        artistName = artist;
    }

    public String getSongName(){return songName;}

    public String getArtistName(){return artistName;}
}
