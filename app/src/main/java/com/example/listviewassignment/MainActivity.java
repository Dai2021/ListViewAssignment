package com.example.listviewassignment;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Context context;
    ArrayList progList;

    public static String [] drinkNames = {"Powerade","Fanta","Aquarius","Sprite","Schweppes","cola","Appletiser","Fuzetea","Stoney","Fresca"};
    public static Integer[] drinktImages = {R.drawable.powerade, R.drawable.fanta,R.drawable.aquarius,R.drawable.sprite,R.drawable.schweppes
            ,R.drawable.cola,R.drawable.appletiser,R.drawable.fuzetea,R.drawable.stoney,R.drawable.fresca};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       AsandaAdapter adapter = new AsandaAdapter(this,drinktImages,drinkNames);
        list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You clicked: "+drinkNames[position],Toast.LENGTH_SHORT).show();

            }
        });

    }
}