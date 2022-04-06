package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Shock extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shock);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("Shock is a critical condition brought on by the sudden drop in blood flow through the body. Shock may result from trauma, heatstroke, blood loss, an allergic reaction, severe infection, poisoning, severe burns or other causes. When a person is in shock, his or her organs aren't getting enough blood or oxygen. If untreated, this can lead to permanent organ damage or even death.\n" +
                "\n" +
                "Signs and symptoms of shock vary depending on circumstances and may include:\n" +
                "\n" +
                "Cool, clammy skin\n" +
                "Pale or ashen skin\n" +
                "Bluish tinge to lips or fingernails (or gray in the case of dark complexions)\n" +
                "Rapid pulse\n" +
                "Rapid breathing\n" +
                "Nausea or vomiting\n" +
                "Enlarged pupils\n" +
                "Weakness or fatigue\n" +
                "Dizziness or fainting\n" +
                "Changes in mental status or behavior, such as anxiousness or agitation\n" +
                "Seek emergency medical care\n" +
                "If you suspect a person is in shock, call 911 or your local emergency number. Then immediately take the following steps:\n" +
                "\n" +
                "Lay the person down and elevate the legs and feet slightly, unless you think this may cause pain or further injury.\n" +
                "Keep the person still and don't move him or her unless necessary.\n" +
                "Begin CPR if the person shows no signs of life, such as not breathing, coughing or moving.\n" +
                "Loosen tight clothing and, if needed, cover the person with a blanket to prevent chilling.\n" +
                "Don't let the person eat or drink anything.\n" +
                "If you suspect that the person is having an allergic reaction, and you have access to an epinephrine autoinjector, use it according to its instructions.\n" +
                "If the person is bleeding, hold pressure over the bleeding area, using a towel or sheet.\n" +
                "If the person vomits or begins bleeding from the mouth, and no spinal injury is suspected, turn him or her onto a side to prevent choking.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(Shock.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}