package com.poliCES2.trabajo2_CES2.modelo;

import java.util.List;

public class Ciudadano implements InterfacePrincipal {

    private String nombre;
    private List<Reciclaje> listaReciclajes;

    public Ciudadano(String nombre, List<Reciclaje> listaReciclajes) {

        this.nombre = nombre;
        this.listaReciclajes = listaReciclajes;

    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public List<Reciclaje> getListaReciclajes() { return listaReciclajes; }

    @Override
    public String separar(List<Reciclaje> reciclajes) {
        return "El Ciudadano " + nombre + " esta separando " + reciclajes.size() + " elementos en bolsas de colores";
    }

    @Override
    public String procesar(List<Reciclaje> reciclajes) {
        return "El Ciudadano " + nombre + " esta lavando los envases.";
    }

    @Override
    public String reutilizar(List<Reciclaje> reciclajes) {
        return "El Ciudadano " + nombre + " hizo una manualidad con los envases";
    }
}