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
        MultiViewTypeAdapter multiViewTypeAdapter = new MultiViewTypeAdapter(getDataSet(), this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(multiViewTypeAdapter);
    }

    private ArrayList<Data> getDataSet() {
        ArrayList<Data> data = new ArrayList<>();
        data.add(new Data(TYPE_HEADER, "This is the header", null, 0, null));
        data.add(new Data(TYPE_ITEM, "title1", "desp1", 1, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title2", "desp2", 2, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title3", "desp3", 3, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title4", "desp4", 4, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title5", "desp5", 5, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title6", "desp6", 6, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title7", "desp7", 7, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title8", "desp8", 8, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title9", "desp9", 9, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title10", "desp10", 10, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title11", "desp11", 11, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title12", "desp12", 12, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title13", "desp13", 13, "https://loremflickr.com/180/180?lock=1"));
        data.add(new Data(TYPE_ITEM, "title14", "desp14", 14, "https://loremflickr.com/180/180?lock=2"));
        data.add(new Data(TYPE_ITEM, "title15", "desp15", 15, "https://loremflickr.com/180/180?lock=1"));
        return data;
    }
}
