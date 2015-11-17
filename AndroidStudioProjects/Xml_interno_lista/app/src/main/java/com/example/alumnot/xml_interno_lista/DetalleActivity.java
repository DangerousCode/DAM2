package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView campoNombre = (TextView) findViewById(R.id.campo_nombre);
        Bundle extras = getIntent().getExtras();

        Personaje personajeActual = (Personaje) extras.getSerializable("Personaje");
        campoNombre.setText(personajeActual.getNombre());
    }
}
