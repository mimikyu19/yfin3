package com.jdeveloper.yfin;

import android.app.Activity;
import android.graphics.ImageFormat;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class menu extends Fragment {

private final int[] BOTONESMENU ={R.id.usuario, R.id.puntaje,R.id.opciones};

    public menu() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton botonmenu;

        for (int i = 0;i<BOTONESMENU.length;i++){

            botonmenu = (ImageButton) mimenu.findViewById(BOTONESMENU[i]);
            final int queboton= i;

            botonmenu.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Activity estaactividad = getActivity();

                    ((ComunicaMenu)estaactividad).menu(queboton);
                }
            });
        }

        return mimenu;
    }
}