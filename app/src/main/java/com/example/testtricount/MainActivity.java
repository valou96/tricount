package com.example.testtricount;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.testtricount.Adapters.RecyclerViewAdapter;
import com.example.testtricount.Interfaces.RecyclerViewClickListener;
import com.example.testtricount.Listners.RecyclerTouchListener;
import com.example.testtricount.Models.Tricount;
import com.example.testtricount.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    private ArrayList<Tricount> Tricounts;

    private ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new
            ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == 1){
                        Intent resultIntent = result.getData();
                        if(resultIntent != null){
                            //Log.d("Resultat", resultIntent.getSerializableExtra("monObjetRecupere").toString() );
                        }
                    }
                }
            });
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

       binding.rvTricount.addOnItemTouchListener(new RecyclerTouchListener(this,  binding.rvTricount, new RecyclerViewClickListener() {
           @Override
           public void onClick(View view, int position) {
                Intent newdata = new Intent(String.valueOf(getApplicationContext()));
                activityResultLauncher.launch(newdata);
           }


       }));
        binding.ButtonAddTricount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewTricount.class);
                activityResultLauncher.launch(intent);
            }
        });
    }

}
