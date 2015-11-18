package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ImageView campoImagen = (ImageView) findViewById(R.id.campoImagen);
        Bitmap imagen = Bitmap.createScaledBitmap(ImageView.setImageUri)
        Bundle extras = getIntent().getExtras();

        Personaje personajeActual = (Personaje) extras.getSerializable("Personaje");
        campoImagen.setImageBitmap();
    }
}
