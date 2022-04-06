package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class CPR extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("PR – or Cardiopulmonary Resuscitation – is an emergency lifesaving procedure performed when the heart stops beating. Immediate CPR can double or triple chances of survival after cardiac arrest.\nThere are two commonly known versions of CPR:\n" +
                "\n" +
                "For healthcare providers and those trained: conventional CPR using chest compressions and mouth-to-mouth breathing at a ratio of 30:2 compressions-to-breaths. In adult victims of cardiac arrest, it is reasonable for rescuers to perform chest compressions at a rate of 100 to 120/min and to a depth of at least 2 inches (5 cm) for an average adult, while avoiding excessive chest compression depths (greater than 2.4 inches [6 cm]).\n" +
                "\n" +
                "For the general public or bystanders who witness an adult suddenly collapse: compression-only CPR, or Hands-Only CPR. Hands-Only CPR is CPR without mouth-to-mouth breaths. It is recommended for use by people who see a teen or adult suddenly collapse in an out-of-hospital setting (such as at home, at work, or in a park).");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(CPR.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}