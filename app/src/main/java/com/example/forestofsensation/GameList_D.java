package com.example.forestofsensation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class GameList_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list__d);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.dinosaur_vv);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        //
        Button b12 = (Button) findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GameFinish.class);
                startActivity(intent);
            };
        });
    }
}
