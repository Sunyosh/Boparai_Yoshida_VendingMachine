package com.example.boparai_yoshida_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class coke extends AppCompatActivity {
Button back;
Intent intent;
TextView cprice;
    TextView cchange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coke);

        back = findViewById(R.id.button2);
        cprice = findViewById(R.id.pricecoke);





       cprice.setText("Price :  P 12");
       cchange.setText("Change : "+ );

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(coke.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}