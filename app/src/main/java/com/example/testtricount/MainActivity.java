package com.example.testtricount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testtricount.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());







    }
}