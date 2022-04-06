package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Bleeding extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleeding);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("Call 911 if:\n" +
                "Bleeding is severe\n" +
                "You suspect internal bleeding\n" +
                "There is an abdominal or chest wound\n" +
                "Bleeding can't be stopped after 10 minutes of firm and steady pressure\n" +
                "Blood spurts out of wound\n" +
                "1. Stop Bleeding\n" +
                "Apply direct pressure on the cut or wound with a clean cloth, tissue, or piece of gauze until bleeding stops.\n" +
                "If blood soaks through the material, don’t remove it. Put more cloth or gauze on top of it and continue to apply pressure.\n" +
                "If the wound is on the arm or leg, raise limb above the heart, if possible, to help slow bleeding.\n" +
                "Wash your hands again after giving first aid and before cleaning and dressing the wound.\n" +
                "Do not apply a tourniquet unless the bleeding is severe and not stopped with direct pressure.\n" +
                "2. Clean Cut or Wound\n" +
                "Gently clean with soap and warm water. Try to rinse soap out of wound to prevent irritation.\n" +
                "Don’t use hydrogen peroxide or iodine, which can damage tissue.\n" +
                "3. Protect the Wound\n" +
                "Apply antibiotic cream to reduce risk of infection and cover with a sterile bandage.\n" +
                "Change the bandage daily to keep the wound clean and dry.\n" +
                "4. When to Call a Doctor\n" +
                "The wound is deep or the edges are jagged or gaping open.\n" +
                "The wound is on the person’s face.\n" +
                "The wound has dirt or debris that won’t come out.\n" +
                "The wound shows signs of infection, such as redness, tenderness, or a thick discharge, or if the person runs a fever.\n" +
                "The area around the wound feels numb.\n" +
                "Red streaks form around the wound.\n" +
                "The wound is a result of an animal or human bite.\n" +
                "The person has a puncture wound or deep cut and hasn’t had a tetanus shot in the past five years, or anyone who hasn’t had a tetanus shot in the past 10 years.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(Bleeding.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }




}