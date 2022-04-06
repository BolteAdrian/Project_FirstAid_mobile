package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class BrokenBones extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broken_bones);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("What are the symptoms of a broken bone?\n" +
                "A broken bone can cause one or more of the following signs and symptoms:\n" +
                "\n" +
                "intense pain in the injured area that gets worse when you move it\n" +
                "numbness in the injured area\n" +
                "bluish color, swelling, or visible deformity in the injured area\n" +
                "bone protruding through the skin\n" +
                "heavy bleeding at the injury site\n" +
                "How can you provide first-aid care for a broken bone?\n" +
                "If you suspect that someone has a broken bone, provide first-aid treatment and help them get professional care:\n" +
                "\n" +
                "Stop any bleeding: If they’re bleeding, elevate and apply pressure to the wound using a sterile bandage, a clean cloth, or a clean piece of clothing.\n" +
                "Immobilize the injured area: If you suspect they’ve broken a bone in their neck or back, help them stay as still as possible. If you suspect they’ve broken a bone in one of their limbs, immobilize the area using a splint or sling.\n" +
                "Apply cold to the area: Wrap an ice pack or bag of ice cubes in a piece of cloth and apply it to the injured area for up to 10 minutes at a time.\n" +
                "Treat them for shock: Help them get into a comfortable position, encourage them to rest, and reassure them. Cover them with a blanket or clothing to keep them warm.\n" +
                "Get professional help: Call 911 or help them get to the emergency department for professional care.\n" +
                "If the person doesn’t appear to be breathing, is unconscious, or both, call 911 for medical help and begin CPR. You should also call 911 if:\n" +
                "\n" +
                "you suspect they’ve broken a bone in their head, neck, or back\n" +
                "the fractured bone has pushed through their skin\n" +
                "they’re bleeding heavily\n" +
                "Otherwise, help them get to the emergency department by car or other means so a doctor can diagnose their condition and recommend appropriate treatment.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(BrokenBones.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}