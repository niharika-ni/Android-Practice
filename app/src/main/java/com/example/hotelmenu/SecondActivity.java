package com.example.hotelmenu;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private Button buttonVeg, buttonNonVeg, buttonBeverage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonVeg = findViewById(R.id.buttonVeg);
        buttonNonVeg = findViewById(R.id.buttonNonVeg);
        buttonBeverage = findViewById(R.id.buttonBeverage);


        buttonNonVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SecondActivity.this, NonActivity.class));
            }
        });

        buttonVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SecondActivity.this, VegActivity.class));
            }
        });

        buttonBeverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SecondActivity.this, BeverageActivity.class));
            }
        });
    }


    }