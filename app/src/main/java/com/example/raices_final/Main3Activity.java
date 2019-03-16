package com.example.raices_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button diamuertos;
    Button independenia;
    Button posadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        diamuertos = (Button) findViewById(R.id.bt_diamuertos);
        independenia = (Button) findViewById(R.id.bt_independencia);
        posadas = (Button) findViewById(R.id.bt_posadas);



        diamuertos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent empezar = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(empezar);

                independenia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent empezar = new Intent(Main3Activity.this, Main5Activity.class);
                        startActivity(empezar);

                        posadas.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent empezar = new Intent(Main3Activity.this, Main5Activity.class);
                                startActivity(empezar);
                            }
                        });
                    }
                });

            }
        });


    }

}
