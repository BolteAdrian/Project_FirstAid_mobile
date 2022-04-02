package com.example.tema4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] ProblemsNames = {"Artificial Respiration","CPR (Cardiac massage)","Shock","Heart Attack","Suffocation or Asphyxia","Cases of Swallowing Tongue","Bleeding","Stings and Bites","Burns","Broken bones"};
    int[] drawableIds = {R.drawable.fff, R.drawable.img_id_row2, R.drawable.img_id_row3, R.drawable.img_id_row4,R.drawable.img_id_row5,R.drawable.img_id_row6,R.drawable.img_id_row7,R.drawable.img_id_row8,R.drawable.img_id_row9,R.drawable.img_id_row10};
    ArrayAdapter<String> customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //finding listview

        listView = findViewById(R.id.listview);
       // customAdapter= new ArrayAdapter<String>(this, R.layout.activity_list_data, R.id.listdata,ProblemsNames);
        //listView.setAdapter(customAdapter);

        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> datum = new HashMap<String, Object>(2);
            datum.put("thumbnail", drawableIds[i]);
            datum.put("name", ProblemsNames[i]);
            data.add(datum);
        }
        listView.setAdapter(new SimpleAdapter(this, data, R.layout.activity_list_data, new String[] {"thumbnail","name"}, new int[] { R.id.imgIcon,R.id.listdata}));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ListData.class);
                intent.putExtra("name",ProblemsNames[i]);

                startActivity(intent);

            }
        });


    }


}