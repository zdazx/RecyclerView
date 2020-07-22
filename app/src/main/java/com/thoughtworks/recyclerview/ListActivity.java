package com.thoughtworks.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.thoughtworks.recyclerview.Data.TYPE_HEADER;
import static com.thoughtworks.recyclerview.Data.TYPE_ITEM;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycle_view_container);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        MultiViewTypeAdapter multiViewTypeAdapter = new MultiViewTypeAdapter(getDataSet());

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(multiViewTypeAdapter);
    }

    private ArrayList<Data> getDataSet() {
        ArrayList<Data> data = new ArrayList<>();
        data.add(new Data(TYPE_HEADER, "This is the header", null, 0));
        data.add(new Data(TYPE_ITEM, "title1", "desp1", 1));
        data.add(new Data(TYPE_ITEM, "title2", "desp2", 2));
        data.add(new Data(TYPE_ITEM, "title3", "desp3", 3));
        data.add(new Data(TYPE_ITEM, "title4", "desp4", 4));
        data.add(new Data(TYPE_ITEM, "title5", "desp5", 5));
        data.add(new Data(TYPE_ITEM, "title6", "desp6", 6));
        data.add(new Data(TYPE_ITEM, "title7", "desp7", 7));
        data.add(new Data(TYPE_ITEM, "title8", "desp8", 8));
        data.add(new Data(TYPE_ITEM, "title9", "desp9", 9));
        data.add(new Data(TYPE_ITEM, "title10", "desp10", 10));
        data.add(new Data(TYPE_ITEM, "title11", "desp11", 11));
        data.add(new Data(TYPE_ITEM, "title12", "desp12", 12));
        data.add(new Data(TYPE_ITEM, "title13", "desp13", 13));
        data.add(new Data(TYPE_ITEM, "title14", "desp14", 14));
        data.add(new Data(TYPE_ITEM, "title15", "desp15", 15));
        return data;
    }
}
