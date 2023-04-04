package com.example.final2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Favortadapet extends RecyclerView.Adapter<Favortadapet.MyHolder> {

        ArrayList<ListItems> items;

public Favortadapet(ArrayList<ListItems> items) {
        this.items = items;
        }

@NonNull
@Override
public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list1, parent, false);
        return new MyHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull Favortadapet.MyHolder holder, int position) {
        holder.tv_name.setText(items.get(position).getName());
        holder.time.setText(items.get(position).gettime());
        holder.imageView.setImageResource(items.get(position).getImage());
        }

@Override
public int getItemCount() {
        return items.size();
        }

public class MyHolder extends RecyclerView.ViewHolder {

    TextView tv_name, time;
    ImageView imageView;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        tv_name = itemView.findViewById(R.id.order_name);
        time = itemView.findViewById(R.id.textView);
        imageView = itemView.findViewById(R.id.image);
    }
}
}
