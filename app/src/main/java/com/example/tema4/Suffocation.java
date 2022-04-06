package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Suffocation extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suffocation);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("Asphyxiation, also called asphyxia or suffocation, is when the body doesn’t get enough oxygen. Without immediate intervention, it can lead to loss of consciousness, brain injury, or death.\n" +
                "If someone can’t breathe for any reason, call 911 immediately. Remove any objects that might interfere with breathing and elevate their chin. If the person is choking, perform the Heimlich maneuver or find someone who knows how to do it.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(Suffocation.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}