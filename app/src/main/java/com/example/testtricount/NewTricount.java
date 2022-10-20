package com.example.testtricount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testtricount.Models.Tricount;
import com.example.testtricount.databinding.ActivityMainBinding;
import com.example.testtricount.databinding.ActivityNewTricountBinding;

import java.net.Inet4Address;

public class NewTricount extends AppCompatActivity {
    private ActivityNewTricountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tricount);
        binding = ActivityNewTricountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.ButtonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String titre = binding.titre.getText().toString(); // pour recupérer le titre saisie dans l'éditText
                String description = binding.description.getText().toString(); // pour recupérer la description saisie dans l'éditText
                Intent resultIntent = new Intent();
                resultIntent.putExtra("Tricount", new Tricount(titre, description ));
                setResult(1, resultIntent);
                NewTricount.super.onBackPressed();
            }
        }
        );


    }
}

/*tricounts.add(nouveauTricounts)*/