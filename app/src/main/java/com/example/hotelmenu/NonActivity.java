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
public class NonActivity extends AppCompatActivity{

    private TextView textViewcb, textViewcr, textViewcf, textViewhead;
    private ImageView imageViewcb, imageViewcr, imageViewcf;

    private Button buttonnoncart;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_non);
        textViewcb = findViewById(R.id.textViewcb);
        textViewcr = findViewById(R.id.textViewcr);
        textViewcf = findViewById(R.id.textViewcf);
        textViewhead = findViewById(R.id.textViewhead);


        imageViewcb = findViewById(R.id.imageViewcb);
        imageViewcr = findViewById(R.id.imageViewcr);
        imageViewcf = findViewById(R.id.imageViewcf);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonnoncart = findViewById(R.id.buttonnoncart);

        buttonnoncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(NonActivity.this, CartActivity.class));
            }
        });
    }


}
