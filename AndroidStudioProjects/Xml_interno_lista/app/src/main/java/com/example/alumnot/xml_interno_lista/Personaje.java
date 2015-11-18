package com.example.alumnot.xml_interno_lista;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class Personaje implements Serializable {

    private String nombre;
    private String rol;
    private Uri imagen;

    public Personaje(String nombre, String rol, Uri imagen) {
        this.nombre = nombre;
        this.rol = rol;
        this.imagen=imagen;
    }

    public Uri getImagen() {
        return imagen;
    }

    public void setImagen(Uri imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {

        return rol;
    }

    public String getNombre() {
        return nombre;
    }
}
