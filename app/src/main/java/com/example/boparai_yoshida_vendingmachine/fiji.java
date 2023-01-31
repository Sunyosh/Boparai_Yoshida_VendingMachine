package com.example.boparai_yoshida_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fiji extends AppCompatActivity {
Button Btnf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiji);

        Btnf = findViewById(R.id.button2);

        Btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(fiji.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}