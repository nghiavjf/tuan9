package com.nghia.pvn.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public ListView list;
    public String[] web =
            {
                    "アメヲマツ、",
                    "South of the Border",
                    "I'll be there",
                    "All About You",
                    "You Don't Know",
                    "Written In The Stars",
            };
    public String[] cs =
            {
                    "美波",
                    "Ed Sheeran(feat. Camila Cabello & Cardi B) ",
                    "Jess glynne",
                    "Taeyeon",
                    "Katelyn Tarver",
                    "WENDY, John Legend",
            };
    public Integer[] imageId =
            {
                    R.drawable.h1,
                    R.drawable.h2,
                    R.drawable.h3,
                    R.drawable.h4,
                    R.drawable.h5,
                    R.drawable.h6
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new CustomList(MainActivity.this, web, cs, imageId);

        list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.th:
                open();
                break;
            case R.id.cn:
                break;
            case R.id.x:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    void open(){
        Intent myIntent=new Intent( this, them.class);
        startActivity(myIntent);

    }
}