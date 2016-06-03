package com.example.administrator.lianxi_music;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView name;
    private Button start;
    private Button stop;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        name = (TextView) findViewById(R.id.song_name);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        player = MediaPlayer.create(MainActivity.this, R.raw.flower);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start:
                player.start();
                break;
            case R.id.stop:
                player.stop();
break;

        }

        }
        }
