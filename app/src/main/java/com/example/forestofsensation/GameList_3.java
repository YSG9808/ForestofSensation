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


public class GameList_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list_3);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.mainmain_vv);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        //  게임재생
        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GameList_4.class);
                startActivity(intent);
            };
        });
    }
}
