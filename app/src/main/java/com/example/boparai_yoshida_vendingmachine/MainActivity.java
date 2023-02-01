package com.example.boparai_yoshida_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView cokei, spritei, fijii, tropicanai;
EditText userinput;
CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();

           userinput = (EditText) findViewById(R.id.editTextNumber);
           cokei = findViewById(R.id.coke);
           spritei = findViewById(R.id.sprite);
           fijii = findViewById(R.id.fiji);
           tropicanai = findViewById(R.id.tropicana);
            checkBox1 = findViewById(R.id.cb1);
            checkBox2 = findViewById(R.id.cb2);
            checkBox3 = findViewById(R.id.cb3);
            checkBox4 = findViewById(R.id.cb4);
            button = findViewById(R.id.button);



            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Bundle args = new Bundle();


                    int input = Integer.parseInt(userinput.getText().toString().trim());

                    if (input >= 34) {
                        checkBox1.setBackgroundColor(Color.GREEN);
                        checkBox2.setBackgroundColor(Color.GREEN);
                        checkBox3.setBackgroundColor(Color.GREEN);
                        checkBox4.setBackgroundColor(Color.GREEN);

                        cokei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,coke.class);
                                // creating a bundle object
                                Bundle bundle = new Bundle();

// storing the string value in the bundle
// which is mapped to key
                                bundle.putString("key1", "GFG :- Main Activity");

// passing the bundle into the intent
                                intent.putExtras(bundle);

// starting the intent
                                startActivity(intent);
                            }
                        });

                        spritei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,sprite.class);
                                startActivity(intent);
                            }
                        });

                        tropicanai.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,tropicana.class);
                                startActivity(intent);
                            }
                        });

                        fijii.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,fiji.class);
                                startActivity(intent);
                            }
                        });
                    }else if (input >= 20) {
                        checkBox1.setBackgroundColor(Color.GREEN);
                        checkBox3.setBackgroundColor(Color.GREEN);
                        checkBox4.setBackgroundColor(Color.GREEN);

                        cokei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,coke.class);
                                startActivity(intent);
                            }
                        });

                        fijii.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,fiji.class);
                                startActivity(intent);
                            }
                        });

                        spritei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,sprite.class);
                                startActivity(intent);
                            }
                        });



                    }else if (input >= 17) {
                        checkBox1.setBackgroundColor(Color.GREEN);
                        checkBox3.setBackgroundColor(Color.GREEN);

                        cokei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,coke.class);
                                startActivity(intent);
                            }
                        });

                        spritei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,sprite.class);
                                startActivity(intent);
                            }
                        });




                    }else if (input >= 12) {
                        checkBox1.setBackgroundColor(Color.GREEN);

                        cokei.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(MainActivity.this,coke.class);
                                startActivity(intent);
                            }
                        });


                    }
                }
            });


            }

        }
    }
