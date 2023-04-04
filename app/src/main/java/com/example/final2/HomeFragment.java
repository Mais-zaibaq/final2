package com.example.final2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private AppCompatButton btn6, btn7, btn8, btn5;
    private Adapter adapter;
    private RecyclerView rv;
    private ArrayList<ListItems> items = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_array, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        items.add(new ListItems("programming", "8h 25min-15 class", R.drawable.programming,"app development"));
        items.add(new ListItems("Design", "5h 25min-15 class", R.drawable.programming,"ux,ui design"));

        adapter=new Adapter(items);
        rv=view.findViewById(R.id.rv);
        rv.setAdapter(adapter);
    }
}