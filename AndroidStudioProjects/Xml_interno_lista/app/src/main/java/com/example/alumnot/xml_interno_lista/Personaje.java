package com.example.alumnot.xml_interno_lista;

import java.io.Serializable;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class Personaje implements Serializable {

    private String nombre;
    private String rol;

    public Personaje(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
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
