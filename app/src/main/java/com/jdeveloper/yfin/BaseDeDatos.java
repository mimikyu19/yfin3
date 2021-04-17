package com.jdeveloper.yfin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseDeDatos extends SQLiteOpenHelper {
    private static final String NOMBRE_BD="bdproyect.bd";
    private static final  int VERSION_BD=1;
    private static final  String TABLA_USUARIOS="create table usuarios(codigo int primary key, nombre text,apellido text,colegio text)";

    public BaseDeDatos(Context context)
    {
        super(context, NOMBRE_BD, null,VERSION_BD);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(TABLA_USUARIOS);
    }
    public  void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF exists"+TABLA_USUARIOS);
        db.execSQL(TABLA_USUARIOS);
    }
    public void agregarUsuario(String codigo, String nombre,String apellido, String colegio){
        SQLiteDatabase bd=getReadableDatabase();
        if (bd!=null){
            bd.execSQL("INSERT INTO usuarios  VALUES('"+codigo+"','"+nombre+"','"+apellido+"','"+colegio+"')");
            bd.close();
        }
    }
}


