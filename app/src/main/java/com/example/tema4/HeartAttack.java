package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class HeartAttack extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_attack);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("Call 911 or emergency medical help if you think you might be having a heart attack. Someone having a heart attack may have any or all of the following:\n" +
                "\n" +
                "Chest pain, pressure or tightness, or a squeezing or aching sensation in the center of the chest\n" +
                "Pain or discomfort that spreads to the shoulder, arm, back, neck, jaw, teeth or occasionally upper abdomen\n" +
                "Nausea, indigestion, heartburn or abdominal pain\n" +
                "Shortness of breath\n" +
                "Lightheadedness, dizziness, fainting\n" +
                "Sweating\n" +
                "A heart attack generally causes chest pain for more than 15 minutes. Some people have mild chest pain, while others have more-severe pain. The discomfort is commonly described as a pressure or chest heaviness, although some people have no chest pain or pressure at all. Women tend to have more-vague symptoms, such as nausea or back or jaw pain.\n" +
                "\n" +
                "Some heart attacks strike suddenly, but many people have warning signs hours or days in advance.\n" +
                "\n" +
                "What to do if you or someone else may be having a heart attack\n" +
                "Call 911 or your local emergency number. Don't ignore the symptoms of a heart attack. If you can't get an ambulance or emergency vehicle to come to you, have a neighbor or a friend drive you to the nearest hospital. Drive yourself only if you have no other option. Because your condition can worsen, driving yourself puts you and others at risk.\n" +
                "Chew and swallow an aspirin while waiting for emergency help. Aspirin helps keep your blood from clotting. When taken during a heart attack, it could reduce heart damage. Don't take aspirin if you are allergic to it or have been told by your doctor never to take aspirin.\n" +
                "Take nitroglycerin, if prescribed. If you think you're having a heart attack and your doctor has previously prescribed nitroglycerin for you, take it as directed while waiting for emergency medical help.\n" +
                "Begin CPR if the person is unconscious. If the person isn't breathing or you don't find a pulse, begin CPR to keep blood flowing after you call for emergency medical help.\n" +
                "\n" +
                "Push hard and fast on the center of the person's chest in a fairly rapid rhythm — about 100 to 120 compressions a minute.\n" +
                "\n" +
                "If an automated external defibrillator (AED) is immediately available and the person is unconscious, follow the device instructions for using it.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(HeartAttack.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}