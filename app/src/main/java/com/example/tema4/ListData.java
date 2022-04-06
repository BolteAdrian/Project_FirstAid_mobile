package com.example.tema4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class ListData extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);



        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");


        if(receivedName.equals("Artificial Respiration")){
            startActivity(new Intent(ListData.this,ArtificialRespiration.class));


    }else   if(receivedName.equals("CPR (Cardiac massage)")){
            startActivity(new Intent(ListData.this,CPR.class));
        }
else  if(receivedName.equals("Shock")){
            startActivity(new Intent(ListData.this,Shock.class));
}else  if(receivedName.equals("Heart Attack")){
            startActivity(new Intent(ListData.this,HeartAttack.class));
        }else  if(receivedName.equals("Suffocation or Asphyxia")){
            startActivity(new Intent(ListData.this,Suffocation.class));
        }
        else  if(receivedName.equals("Cases of Swallowing Tongue")){
            startActivity(new Intent(ListData.this,CasesofSwallowingTongue.class));
        }
        else  if(receivedName.equals("Bleeding")){
            startActivity(new Intent(ListData.this,Bleeding.class));
        }
        else  if(receivedName.equals("Stings and Bites")){
            startActivity(new Intent(ListData.this,StingsAndBites.class));
        }
        else  if(receivedName.equals("Burns")){
            startActivity(new Intent(ListData.this,Burns.class));
        }
        else  if(receivedName.equals("Broken bones")){
            startActivity(new Intent(ListData.this,BrokenBones.class));
        }


        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(ListData.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}


