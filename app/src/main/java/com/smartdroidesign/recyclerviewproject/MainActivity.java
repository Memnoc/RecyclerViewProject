package com.smartdroidesign.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> ListItems;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListItems = new ArrayList<>();

        for (int i = 0; i<=10; i++){
            ListItem listItem = new ListItem(
                    "Heading" + (i+1),
                    "Lorem ipsum dummy text"
            );

            ListItems.add(listItem);
        }

        adapter = new MyAadapter(ListItems, this);

        recyclerView.setAdapter(adapter);
    }
}
