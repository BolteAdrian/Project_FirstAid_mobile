package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class ListData extends AppCompatActivity {

    TextView listdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);
        listdata = findViewById(R.id.listdata);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");


        if(receivedName.equals("Apple")){
            listdata.setText("Apple price:1 euro/kg");

    }else   if(receivedName.equals("Orange")){
            listdata.setText("Orange price:1.5 euro/kg");}
else  if(receivedName.equals("Banana")){
                listdata.setText("Banana price:1.8 euro/kg");

}else  if(receivedName.equals("Kiwi")){
            listdata.setText("Kiwi price:2 euro/kg");

        }else  if(receivedName.equals("Passion")){
            listdata.setText("Passion price:2.5 euro/kg");

        }
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}


