package com.example.e03_gui_fixed;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlaceAdapter adapter = new PlaceAdapter(this);
        ListView listView = findViewById(R.id.lv_places);
        listView.setAdapter(adapter);
    }
}