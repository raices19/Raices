package com.example.raices_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {


    Button inicio;
    Button registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registro = (Button) findViewById(R.id.bt_inicio_registro);
        inicio = (Button) findViewById(R.id.bt_inicio);


        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registro = new Intent(login.this, registro.class);
                startActivity(registro);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inicio = new Intent(login.this, Main2Activity.class);
                startActivity(inicio);



                    }
                });
            }
        });
    }


}
