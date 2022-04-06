package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Burns extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        text=findViewById(R.id.textView1);
        text.setText("First aid for burns\n" +
                "Stop the burning process as soon as possible. This may mean removing the person from the area, dousing flames with water, or smothering flames with a blanket. Do not put yourself at risk of getting burnt as well.\n" +
                "Remove any clothing or jewellery near the burnt area of skin, including babies' nappies. But do not try to remove anything that's stuck to the burnt skin, as this could cause more damage.\n" +
                "Cool the burn with cool or lukewarm running water for 20 minutes as soon as possible after the injury. Never use ice, iced water, or any creams or greasy substances like butter.\n" +
                "Keep yourself or the person warm. Use a blanket or layers of clothing, but avoid putting them on the injured area. Keeping warm will prevent hypothermia, where a person's body temperature drops below 35C (95F). This is a risk if you're cooling a large burnt area, particularly in young children and elderly people.\n" +
                "Cover the burn with cling film. Put the cling film in a layer over the burn, rather than wrapping it around a limb. A clean clear plastic bag can be used for burns on your hand.\n" +
                "Treat the pain from a burn with paracetamol or ibuprofen. Always check the manufacturer's instructions when using over-the-counter medication. Children under 16 years of age should not be given aspirin.\n" +
                "Sit upright as much as possible if the face or eyes are burnt. Avoid lying down for as long as possible, as this will help reduce swelling.\n" +
                "When to go to hospital\n" +
                "Once you have taken these steps, you'll need to decide whether further medical treatment is necessary. \n" +
                "\n" +
                "Go to a hospital accident and emergency (A&E) department for:\n" +
                "\n" +
                "large or deep burns bigger than the affected person's hand\n" +
                "burns of any size that cause white or charred skin\n" +
                "burns on the face, hands, arms, feet, legs or genitals that cause blisters\n" +
                "all chemical and electrical burns\n" +
                "Also get medical help straight away if the person with the burn:\n" +
                "\n" +
                "has other injuries that need treating\n" +
                "is going into shock – signs include cold, clammy skin, sweating, rapid, shallow breathing, and weakness or dizziness\n" +
                "is pregnant\n" +
                "is over the age of 60\n" +
                "is under the age of 5\n" +
                "has a medical condition, such as heart, lung or liver disease, or diabetes\n" +
                "has a weakened immune system (the body's defence system) – for example, because of HIV or AIDS, or because they're having chemotherapy for cancer\n" +
                "If someone has breathed in smoke or fumes, they should also seek medical attention.\n" +
                "\n" +
                "Some symptoms may be delayed, and can include:\n" +
                "\n" +
                "coughing\n" +
                "a sore throat\n" +
                "difficulty breathing\n" +
                "singed nasal hair\n" +
                "facial burns\n" +
                "See recovering from burns and scalds for information on how serious burns are treated.\n" +
                "\n" +
                "Electrical burns\n" +
                "Electrical burns may not look serious, but they can be very damaging. Someone who has an electrical burn should seek immediate medical attention at an A&E department.\n" +
                "\n" +
                "If the person has been injured by a low-voltage source (up to 220 to 240 volts) such as a domestic electricity supply, safely switch off the power supply or remove the person from the electrical source using a material that doesn't conduct electricity, such as a wooden stick or a wooden chair.\n" +
                "\n" +
                "Do not approach a person who's connected to a high-voltage source (1,000 volts or more).\n" +
                "\n" +
                "Acid and chemical burns\n" +
                "Acid and chemical burns can be very damaging and require immediate medical attention at an A&E department.\n" +
                "\n" +
                "If possible, find out what chemical caused the burn and tell the healthcare professionals at A&E.\n" +
                "\n" +
                "If you're helping someone else, put on appropriate protective clothing and then:\n" +
                "\n" +
                "remove any contaminated clothing on the person\n" +
                "if the chemical is dry, brush it off their skin\n" +
                "use running water to remove any traces of the chemical from the burnt area\n" +
                "Sunburn\n" +
                "In cases of sunburn, follow the advice below:\n" +
                "\n" +
                "If you notice any signs of sunburn, such as hot, red and painful skin, move into the shade or preferably inside.\n" +
                "Take a cool bath or shower to cool down the burnt area of skin.\n" +
                "Apply aftersun lotion to the affected area to moisturise, cool and soothe it. Don't use greasy or oily products.\n" +
                "If you have any pain, paracetamol or ibuprofen should help relieve it. Always read the manufacturer's instructions and do not give aspirin to children under the age of 16.\n" +
                "Stay hydrated by drinking plenty of water.\n" +
                "Watch out for signs of heat exhaustion or heatstroke, where the temperature inside your body rises to 37 to 40C (98.6 to 104F) or above. Symptoms include dizziness, a rapid pulse or vomiting.\n" +
                "If a person with heat exhaustion is taken to a cool place quickly, given water to drink and has their clothing loosened, they should start to feel better within half an hour.\n" +
                "\n" +
                "If they don't, they could develop heatstroke. This is a medical emergency and you'll need to call 999 for an ambulance.");
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(Burns.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}