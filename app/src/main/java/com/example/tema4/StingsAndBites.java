package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class StingsAndBites extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stings_and_bites);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("Pressure immobilisation for bites and stings\n" +
                "The pressure immobilisation method is useful for some bites and stings, but not all. It is ideal for Australian venomous snakes and for funnel web spiders, blue ring octopus and cone fish. It is not recommended for any other types of bites and stings.\n" +
                "\n" +
                "The pressure immobilisation method is designed to slow the movement of venom through the lymphatic system. The lymphatic system is a network of tubes that drains fluid (lymph) from the body’s tissues and empties it back into the bloodstream.\n" +
                "\n" +
                "Bandaging the wound firmly tends to squash the nearby lymph vessels, which helps to prevent the venom from leaving the puncture site. If you don’t have any bandages at hand, use whatever is available, including clothing, stockings or towels. Firmly bandage the wound but not tight enough to cause numbness, tingling or any colour change to the extremities.\n" +
                "\n" +
                "Immobilising the limb is another way to slow the spread of venom, sometimes delaying it for hours at a time. This is because the lymphatic system relies on muscle movement in order to squeeze lymph through its vessels. Splint the limb if necessary.\n" +
                "\n" +
                "In general, try to keep the patient calm and reassured. Always seek immediate medical help.\n" +
                "\n" +
                "Don’t tourniquet or cut bites or stings\n" +
                "In the past, a tight tourniquet was recommended as the best method to cut off blood flow and prevent the circulation of venom through the body. This is no longer advised. Do not cut a bite to release the venom or try to suck the venom out of the wound. Don’t give the affected person alcohol to drink.\n" +
                "\n" +
                "First aid for bites and stings from land creatures\n" +
                "The first aid for bites and stings from land creatures can depend on what type of creature it is.\n" +
                "\n" +
                "Bee sting\n" +
                "Remove the sting by sliding or scraping your fingernail across it, rather than pulling at it. Wash the area and apply ice to reduce the swelling. If the person has an allergy to bee stings, they can fall into a life-threatening state of anaphylactic shock. The only treatment is an injection of adrenaline. Immobilise the person, apply pressure to the bite and seek immediate medical help.\n" +
                "\n" +
                "Funnel web spider bite\n" +
                "Seek immediate medical help. Bandage the wound firmly with a pressure immobilisation bandage. Use a second bandage to wrap the arm or leg and splint the affected limb. Antivenom is required.\n" +
                "\n" +
                "Red-back spider bite\n" +
                "Wash the affected area well and soothe the pain with icepacks or iced water. Do not bandage the area.\n" +
                "\n" +
                "Snake bite\n" +
                "Seek immediate medical help. Not all Australian snakes are venomous but you should follow the basic first aid techniques, just in case. Don’t wash the skin, as traces of venom left behind might be needed by medical personnel to identify the snake. Use a pressure immobilisation bandage and splint the limb. If the person was bitten on the torso, make sure your bandaging doesn’t restrict their breathing.\n" +
                "\n" +
                "Tick bite\n" +
                "If a tick has burrowed into the skin, grasp it behind the head with fine tweezers, as close to the skin as possible. Gently pull it straight out with steady pressure, making sure you remove the entire body. After removal of the tick, wash the site with warm soapy water and then a mild antiseptic. Cover the site with a ‘bandaid’ type dressing for 24 hours. Keep the removed tick for identification purposes in case the person’s condition gets worse. Do not use methylated spirits, alcohol or anything else to kill the tick before removing, as this may cause the tick to inject more poison. In the case of the Australian paralysis tick, antivenom is available. A tetanus injection might also be needed.\n" +
                "\n" +
                "European wasp sting\n" +
                "Clean the affected area with soap and warm water. Use an icepack to reduce swelling and pain. Use pain-relieving medication and creams. Be alert for signs of anaphylaxis, which is a severe and life-threatening type of allergic reaction. Prolonged swelling at the site of the sting may respond to antihistamines – see your pharmacist for further advice.\n" +
                "\n" +
                "First aid for bites and stings from sea creatures\n" +
                "The first aid for bites and stings from sea creatures can depend on what type of creature it is.\n" +
                "\n" +
                "Blue-ringed octopus sting\n" +
                "A bite can cause paralysis. Seek immediate medical help. You may need to commence CPR (cardiopulmonary resuscitation). Even if your efforts seem futile, continue CPR until medical help arrives. The pressure immobilisation bandage method is suitable for blue ring octopus stings.\n" +
                "\n" +
                "Box jellyfish sting\n" +
                "Seek immediate medical help. Stop the tentacles from stinging by pouring vinegar over them. Immobilise the limb and bandage firmly. You may need to commence CPR (cardiopulmonary resuscitation). Antivenom is available.\n" +
                "\n" +
                "Jellyfish sting\n" +
                "Wash the tentacles off with water. Use icepacks or anaesthetic cream to reduce the pain.\n" +
                "\n" +
                "Stonefish sting\n" +
                "Seek immediate medical help. Bathe the area in warm water. Antivenom is available. A tetanus injection might be needed.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(StingsAndBites.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}