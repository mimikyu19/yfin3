package com.jdeveloper.yfin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Button siguiente;
    Button iniciar;
    Button admin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente = (Button)findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent siguiente = new Intent(MainActivity.this, registro.class);
                startActivity(siguiente);


            }
        });
        iniciar = (Button)findViewById(R.id.iniciar);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciar = new Intent(MainActivity.this,sesion.class);
                startActivity(iniciar);
            }
        });
        admin = (Button)findViewById(R.id.btnadmin);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admin = new Intent(MainActivity.this,crudy.class);
                startActivity(admin);
            }
        });





    }
}