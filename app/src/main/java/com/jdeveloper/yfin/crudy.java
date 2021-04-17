package com.jdeveloper.yfin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class crudy extends AppCompatActivity {

    EditText editcodigo,editnombre,editapellido,editcolegio;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crudy);

        editcodigo=(EditText)findViewById(R.id.editTextTextPersonName13);
        editnombre=(EditText)findViewById(R.id.editTextTextPersonNombre);
        editapellido=(EditText)findViewById(R.id.editTextTextPersonName11);
        editcolegio=(EditText)findViewById(R.id.editTextTextPersonName15);
        btnAgregar=(Button) findViewById(R.id.button6);
        final BaseDeDatos Basedatos=new BaseDeDatos(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Basedatos.agregarUsuario(editcodigo.getText().toString(),editnombre.getText().toString(),editapellido.getText().toString(),editcolegio.getText().toString());
                Toast.makeText(getApplicationContext(),"se agregaron los datos correctamente",Toast.LENGTH_SHORT).show();
            }
        });

    }
}