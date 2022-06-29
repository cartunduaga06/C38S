package com.example.C38S.model;

import org.springframework.data.annotation.Id;

public class Equipo {

    @Id
    private String id;
    private String nombre;
    private String pais;

    public Equipo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
