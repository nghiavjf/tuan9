package com.nghia.pvn.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;


public class them extends MainActivity {
    ListView list1;
    String[] web1 =
            {
                    "アメヲマツ、",
                    "South of the Border",
                    "I'll be there",
                    "All About You",
                    "You Don't Know",
                    "Written In The Stars",
            };
    String[] cs1 =
            {
                    "美波",
                    "Ed Sheeran(feat. Camila Cabello & Cardi B) ",
                    "Jess glynne",
                    "Taeyeon",
                    "Katelyn Tarver",
                    "WENDY, John Legend",
            };
    Integer[] imageId1 =
            {
                    R.drawable.h1,
                    R.drawable.h2,
                    R.drawable.h3,
                    R.drawable.h4,
                    R.drawable.h5,
                    R.drawable.h6
            };
    Button btnthem;
    TextView n,c;
    ImageView a;
    Integer t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.them);

        CustomList adapter = new CustomList(them.this, web1, cs1, imageId1);
        btnthem=(Button)  findViewById(R.id.btnthem);
        n=(TextView) findViewById(R.id.txt) ;
        c=(TextView) findViewById(R.id.txt2);
        a=(ImageView) findViewById(R.id.img);
        list1 = (ListView) findViewById(R.id.l);
        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                n.setText(web1[+position]);
                c.setText(cs1[+position]);
                a.setImageResource(imageId1[+position]);
                t=imageId1[+position];

            }
        });
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nh=n.getText().toString();
                web1 =addElement(web1, nh);
                String cas=n.getText().toString();
                cs1 =addElement(cs1, cas);
                Integer an=t;
                imageId1= addElementanh(imageId1, an);
                CustomList adapter = new CustomList(them.this, web1, cs1, imageId1);
                list1.setAdapter(adapter);
                //open1();

            }
        });

    }
    static String[] addElement ( String[] a, String e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    static Integer[] addElementanh ( Integer[] a, Integer e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    void open1(){
        Intent myIntent=new Intent( this, MainActivity.class);
        startActivity(myIntent);

    }
}
