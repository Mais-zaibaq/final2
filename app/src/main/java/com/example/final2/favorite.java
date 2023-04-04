package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class favorite extends AppCompatActivity {
    ArrayList<ListItems> items = new ArrayList<>();
    Favortadapet favortadapet;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        items.add(new ListItems("ui ux design","$20.00",R.drawable.programming,""));
        items.add(new ListItems("App devlopment","$22.0",R.drawable.programming,""));
        items.add(new ListItems("c programming language","$25.21",R.drawable.programming,""));
        items.add(new ListItems("Business Management","$29.68",R.drawable.programming,""));

        favortadapet=new Favortadapet(items);
        recyclerView=findViewById(R.id.rv1);
        recyclerView.setAdapter(favortadapet);


    }
}