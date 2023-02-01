package com.example.boparai_yoshida_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sprite extends AppCompatActivity {
Button btns;
    TextView sprice, schange;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprite);

        btns = findViewById(R.id.button2);
        sprice = findViewById(R.id.pricesprite);
        schange = findViewById(R.id.changesprite);
        intent = getIntent();

        sprice.setText("Price :   P 17");
        schange.setText("Change : P " +intent.getIntExtra("final_grade", 0 ));

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(sprite.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}