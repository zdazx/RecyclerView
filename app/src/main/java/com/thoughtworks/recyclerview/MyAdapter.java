package com.thoughtworks.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {
    private ArrayList<Data> dataSet;

    public MyAdapter(ArrayList<Data> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titleView;
        public TextView numberView;
        public TextView descView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.title);
            numberView = itemView.findViewById(R.id.number);
            descView = itemView.findViewById(R.id.desc);
        }
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Data data = dataSet.get(position);
        ((MyViewHolder) holder).titleView.setText(data.title);
        ((MyViewHolder) holder).descView.setText(data.description);
        ((MyViewHolder) holder).numberView.setText(String.valueOf(data.number));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
