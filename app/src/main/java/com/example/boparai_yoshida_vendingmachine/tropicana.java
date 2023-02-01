package com.example.boparai_yoshida_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tropicana extends AppCompatActivity {
Button btnt;
    TextView tprice, tchange;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tropicana);

        btnt = findViewById(R.id.button2);
        tprice = findViewById(R.id.pricetropicana);
        tchange = findViewById(R.id.changetropicana);
        intent = getIntent();

        tprice.setText("Price :   P 34");
        tchange.setText("Change : P " +intent.getIntExtra("final_grade", 0 ));

        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(tropicana.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}