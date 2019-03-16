package com.example.raices_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button cultura;
    Button valores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cultura = (Button) findViewById(R.id.bt_cultura);
        valores = (Button) findViewById(R.id.bt_valores);

        cultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cultura = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(cultura);

                valores.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent valores = new Intent(Main2Activity.this, Main4Activity.class);
                        startActivity(valores);

                    }
                });
            }
        });
    }


}
