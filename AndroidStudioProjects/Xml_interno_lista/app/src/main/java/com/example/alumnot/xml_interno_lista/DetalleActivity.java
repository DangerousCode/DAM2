package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ImageView campoImagen = (ImageView) findViewById(R.id.campoImagen);
        TextView campoTexto = (TextView) findViewById(R.id.campoTexto);
        Bundle extras = getIntent().getExtras();

        Personaje personajeActual = (Personaje) extras.getSerializable("Personaje");
        campoTexto.setText(personajeActual.getHistoria());
        int res_imagen=getResources().getIdentifier(personajeActual.getImagen(),"drawable",getPackageName());
        campoImagen.setImageResource(res_imagen);
    }
}
