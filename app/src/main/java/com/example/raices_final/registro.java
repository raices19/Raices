package com.example.raices_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro extends AppCompatActivity {

    Button inicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        inicio = (Button) findViewById(R.id.bt_crear);


        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inicio = new Intent(registro.this, Main2Activity.class);
                startActivity(inicio);


            }
        });
    }
}