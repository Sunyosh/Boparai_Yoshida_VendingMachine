package com.example.boparai_yoshida_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fiji extends AppCompatActivity {
Button Btnf;
    TextView fprice, fchange;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiji);

        Btnf = findViewById(R.id.button2);
        fprice = findViewById(R.id.pricefiji);
        fchange = findViewById(R.id.changecfiji);
        intent = getIntent();

        fprice.setText("Price :   P 20");
        fchange.setText("Change : P " +intent.getIntExtra("final_grade", 0 ));

        Btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(fiji.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}