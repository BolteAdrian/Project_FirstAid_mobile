package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class ArtificialRespiration extends AppCompatActivity {
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificial_respiration);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("Artificial respiration is also known as artificial ventilation. This is a metabolic process that stimulates or assists respiration.\n This is a process where a complete exchange of gases is observed via external respiration, internal respiration, and pulmonary ventilation.\n This process is based on facilitating manual air to a person who is not able to breathe or sufficient respiration efforts cannot be handled by him. \nThis may also be defined as mechanical ventilation where usage of the mechanical ventilator is involved to move the air out and into the lungs (the person is not able to breathe on his own). For instance, at the time of surgery, in a coma, in trauma, or a general anaesthesia condition, this therapy is used.\nIt means breathing induced by some of the manipulative techniques. When the natural respiration has been stopped and the heart is running or flattering, artificial respiration is applied quickly and properly to prevent people from dying due to drowning, choking, strangulation, suffocation, carbon monoxide poisoning, or electric shock.\n Machines of artificial respiration are also known as artificial lung ventilation machines.\nArtificial respiration mainly consists of two actions, primarily to maintain and establish an open-air passage from the upper respiratory tract to the lungs, and then the exchange of air and carbon dioxide in the terminal air sac of the lungs, while the heart is still functioning.");



    //enable back Button
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(ArtificialRespiration.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}