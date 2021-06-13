package com.example.forestofsensation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class GameList_R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list__r);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.rabbit_vv);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        //
        Button b13 = (Button) findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GameFinish.class);
                startActivity(intent);
            };
        });
    }
}
