package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> words = new ArrayList<>();

        for(int i=1;i<=20;i++){
            words.add(new Song("Song "+ i,"Artist "+i));
        }



        SongAdapter adapter = new SongAdapter(this,words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){

                    case 0: Intent intent = new Intent(view.getContext(),SongPlay.class);
                            startActivityForResult(intent,0);
                            break;

                    case 1: Intent intent2 = new Intent(view.getContext(),SongPlay2.class);
                            startActivity(intent2);
                            break;

                }
            }
        });

    }
}
