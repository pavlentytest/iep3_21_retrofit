package ru.samsung.itschool.mdev.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ru.samsung.itschool.mdev.myapplication.api.AnekdotAPI;
import ru.samsung.itschool.mdev.myapplication.model.Anekdot;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://umorili.herokuapp.com/";
    private AnekdotAPI api;
    private ArrayList<Anekdot> anekdots = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(anekdots);
        recyclerView.setAdapter(adapter);

        

    }
}