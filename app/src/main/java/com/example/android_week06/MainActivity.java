package com.example.android_week06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ShoesAdapter adt;
    private ArrayList<Shoes> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShoseFragment shoseFragment= new ShoseFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_layout,shoseFragment,"hi").commit();


    }
}