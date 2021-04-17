package com.jdeveloper.yfin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class index extends AppCompatActivity implements ComunicaMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    @Override
    public void menu(int queboton) {

        Intent in = new Intent(index.this, configuracion.class);

        in.putExtra("BOTONPULSADO", queboton);

        startActivity(in);

    }
}