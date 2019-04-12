package com.example.macbookpro.diksi;


//import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
//import android.view.View;


import java.util.ArrayList;
//import java.util.List;



public class HomePage extends AppCompatActivity {

    private static final String TAG = "HomePage";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://static.poetryfoundation.org/jstor/i20590218/pages/25.png");
        mNames.add("pages 1");

        mImageUrls.add("https://static.poetryfoundation.org/jstor/i20590218/pages/26.png");
        mNames.add("pages 2");

        mImageUrls.add("https://static.poetryfoundation.org/jstor/i20590218/pages/27.png");
        mNames.add("pages 3");



        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        Adapter adapter = new Adapter (this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

