package com.example.audiovideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        recyclerView = findViewById( R.id.recyclerView );
        myAdapter = new MyAdapter(100);
        recyclerView.setAdapter( myAdapter );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
    }
}
