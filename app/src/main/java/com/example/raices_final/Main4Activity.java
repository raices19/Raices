package com.example.raices_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button respeto;
    Button igualdad;
    Button solida;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        respeto = (Button) findViewById(R.id.bt_respeto);
        igualdad = (Button) findViewById(R.id.bt_igualdad);
        solida = (Button) findViewById(R.id.bt_solida);



        respeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent empezar = new Intent(Main4Activity.this, Main6Activity.class);
                startActivity(empezar);

                igualdad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent empezar = new Intent(Main4Activity.this, Main6Activity.class);
                        startActivity(empezar);

                        solida.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent empezar = new Intent(Main4Activity.this, Main6Activity.class);
                                startActivity(empezar);
                            }
                        });
                    }
                });

            }
        });


    }

}
