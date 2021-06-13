package com.example.forestofsensation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class GameFinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_finish);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.game_finish_vv);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        //  홈화면으로 돌아가기 버튼
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GameList_1.class);
                startActivity(intent);
            };
        });

        //  다시하기 버튼
        Button b11 = (Button) findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GameList_2.class);
                startActivity(intent);
            };
        });
    }
}
