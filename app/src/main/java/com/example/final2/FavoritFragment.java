package com.example.final2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FavoritFragment extends Fragment {
    ArrayList<ListItems> items = new ArrayList<>();
    Favortadapet favortadapet;
    RecyclerView recyclerView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        items.add(new ListItems("ui ux design","$20.00",R.drawable.programming,""));
        items.add(new ListItems("App devlopment","$22.0",R.drawable.programming,""));
        items.add(new ListItems("c programming language","$25.21",R.drawable.programming,""));
        items.add(new ListItems("Business Management","$29.68",R.drawable.programming,""));

        favortadapet=new Favortadapet(items);
        recyclerView=view.findViewById(R.id.rv1);
        recyclerView.setAdapter(favortadapet);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_favorite, container, false);
    }
}