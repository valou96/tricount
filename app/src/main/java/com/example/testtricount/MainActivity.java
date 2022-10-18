package com.example.testtricount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.testtricount.Adapters.RecyclerViewAdapter;
import com.example.testtricount.Models.Tricount;
import com.example.testtricount.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    private List<Tricount> Tricounts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.rvTricount.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.rvTricount.setLayoutManager(layoutManager);
        binding.rvTricount.setFocusable(false);


        Tricounts = new ArrayList<Tricount>();
        Tricounts.add(new Tricount("paris","voyage à paris"));
        Tricounts.add(new Tricount("Londres","voyage à Londres"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(Tricounts);
        binding.rvTricount.setAdapter(adapter);

      /* binding.rvTricount.addOnItemTouchListener(new RecyclerTouchListener(this,  binding.rvTricount, new RecyclerViewClickListener() {
           @Override
           public void onClick(View view, int position) {

           }


       }));*/
    };






}
