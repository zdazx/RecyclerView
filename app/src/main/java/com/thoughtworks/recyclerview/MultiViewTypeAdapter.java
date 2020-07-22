package com.thoughtworks.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MultiViewTypeAdapter extends RecyclerView.Adapter {
    private ArrayList<Data> dataSet;

    public MultiViewTypeAdapter(ArrayList<Data> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MyItemViewHolder extends RecyclerView.ViewHolder {
        public TextView titleView;
        public TextView numberView;
        public TextView descView;

        public MyItemViewHolder(@NonNull View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.title);
            numberView = itemView.findViewById(R.id.number);
            descView = itemView.findViewById(R.id.desc);
        }
    }

    public static class MyHeaderViewHolder extends RecyclerView.ViewHolder {
        public TextView headerView;

        public MyHeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            headerView = itemView.findViewById(R.id.header);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Data.TYPE_HEADER:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_header, parent, false);
                return new MyHeaderViewHolder(view);
            case Data.TYPE_ITEM:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_item, parent, false);
                return new MyItemViewHolder(view);
            default:
                return null;
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (dataSet.get(position).type) {
            case 0:
                return Data.TYPE_HEADER;
            case 1:
                return Data.TYPE_ITEM;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Data data = dataSet.get(position);
        if (data != null) {
            switch (data.type) {
                case Data.TYPE_HEADER:
                    ((MyHeaderViewHolder) holder).headerView.setText(data.title);
                    break;
                case Data.TYPE_ITEM:
                    ((MyItemViewHolder) holder).titleView.setText(data.title);
                    ((MyItemViewHolder) holder).descView.setText(data.description);
                    ((MyItemViewHolder) holder).numberView.setText(String.valueOf(data.number));
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
