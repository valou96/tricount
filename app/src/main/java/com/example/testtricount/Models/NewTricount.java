package com.example.testtricount.Models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.widget.Button;
import android.widget.Spinner;

import com.example.testtricount.R;

public class NewTricount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tricount);
        Button validButton = findViewById(R.id.button2);
        validButton.setOnClickListener(new DialogInterface.OnClickListener()){
            @Override
            public void onClick(View view){
                mgetContent.launch("");
            }
        };

    }


}