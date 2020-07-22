package com.thoughtworks.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycle_view_container);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        MyAdapter myAdapter = new MyAdapter(getDataSet());

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Data> getDataSet() {
        ArrayList<Data> data = new ArrayList<>();
        data.add(new Data("title1", "desp1", 1));
        data.add(new Data("title2", "desp2", 2));
        data.add(new Data("title3", "desp3", 3));
        data.add(new Data("title4", "desp4", 4));
        data.add(new Data("title5", "desp5", 5));
        data.add(new Data("title6", "desp6", 6));
        data.add(new Data("title7", "desp7", 7));
        data.add(new Data("title8", "desp8", 8));
        data.add(new Data("title9", "desp9", 9));
        data.add(new Data("title10", "desp10", 10));
        data.add(new Data("title11", "desp11", 11));
        data.add(new Data("title12", "desp12", 12));
        data.add(new Data("title13", "desp13", 13));
        data.add(new Data("title14", "desp14", 14));
        data.add(new Data("title15", "desp15", 15));
        return data;
    }
}
