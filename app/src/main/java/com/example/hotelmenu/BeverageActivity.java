package com.example.hotelmenu;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class BeverageActivity extends AppCompatActivity{

    private TextView textViewcola, textViewjuice, textViewtea, textViewhead3;
    private ImageView imageViewcola, imageViewjuice, imageViewtea;

    private Button buttonbevcart;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_beverage);
        textViewcola = findViewById(R.id.textViewcola);
        textViewjuice = findViewById(R.id.textViewjuice);
        textViewtea = findViewById(R.id.textViewtea);
        textViewhead3 = findViewById(R.id.textViewhead3);


        imageViewcola = findViewById(R.id.imageViewcola);
        imageViewjuice = findViewById(R.id.imageViewjuice);
        imageViewtea = findViewById(R.id.imageViewtea);

        Button buttonbevcart = findViewById(R.id.buttonbevcart);

        buttonbevcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(BeverageActivity.this, CartActivity.class));
            }
        });
    }


}
