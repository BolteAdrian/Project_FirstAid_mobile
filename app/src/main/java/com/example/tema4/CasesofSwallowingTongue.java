package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class CasesofSwallowingTongue extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casesof_swallowing_tongue);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("It is not possible to swallow the tongue. Bodily tissue firmly connects the tongue to the mouth, which prevents people from accidentally swallowing it.\n" +
                "\n" +
                "It is a common myth that a person can swallow their tongue during a seizure, while asleep, or if they become unconscious. However, these events can cause an individual to have difficulty breathing if the tongue blocks the throat. Sometimes, people can also get oral injuries.When a person falls unconscious, the muscles relax, including the tongue. If a person is lying on their back, the relaxed tongue can block the throat and partially or completely obstruct their breathing.\n" +
                "\n" +
                "People with obstructive sleep apnea can experience this during sleep, and there is also a risk of it occurring when a person falls unconscious.\n" +
                "\n" +
                "Moving someone who is unconscious into the recovery positionTrusted Source prevents the tongue from falling back toward the throat. People can follow these steps to put someone into the recovery position:\n" +
                "\n" +
                "Kneel next to the person.\n" +
                "Extend the nearest arm out from the body with the palm facing upward.\n" +
                "Place the opposite arm so that the person’s hand is on the cheek on the nearest side of the face.\n" +
                "Keeping the nearest leg out straight, lift the other knee so that it is bent.\n" +
                "Use that knee as a lever to roll the person onto their side.\n" +
                "Move the bent knee upward into a running position to stabilize the person.\n" +
                "Check that the tongue has fallen forward and that they are breathing normally.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(CasesofSwallowingTongue.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}