package com.thoughtworks.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button recycleBtn = findViewById(R.id.recycle_view_btn);
        recycleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecycleActivity();
            }
        });
    }

    private void openRecycleActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}