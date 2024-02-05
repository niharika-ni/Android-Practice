package com.example.hotelmenu;
import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class VegActivity extends AppCompatActivity {

    private TextView textViewvb, textViewvr, textViewvf, textViewhead2;
    private ImageView imageViewvb, imageViewvr, imageViewvf;

    private Button buttonvegcart;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_veg);
        textViewvb = findViewById(R.id.textViewvb);
        textViewvr = findViewById(R.id.textViewvr);
        textViewvf = findViewById(R.id.textViewvf);
        textViewhead2 = findViewById(R.id.textViewhead2);


        imageViewvb = findViewById(R.id.imageViewvb);
        imageViewvr = findViewById(R.id.imageViewvr);
        imageViewvf = findViewById(R.id.imageViewvf);

        Button buttonvegcart = findViewById(R.id.buttonvegcart);

        buttonvegcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(VegActivity.this, CartActivity.class));
            }
        });
    }

}