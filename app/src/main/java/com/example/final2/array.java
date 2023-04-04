package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class array extends AppCompatActivity {
    private AppCompatButton btn6, btn7, btn8, btn5;
    private Adapter adapter;
    private RecyclerView rv;
    private ArrayList<ListItems> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        items.add(new ListItems("programming", "8h 25min-15 class", R.drawable.programming,"app development"));
        items.add(new ListItems("Design", "5h 25min-15 class", R.drawable.programming,"ux,ui design"));

        adapter=new Adapter(items);
        rv=findViewById(R.id.rv);
        rv.setAdapter(adapter);

    }





    }



