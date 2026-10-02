package com.poliCES2.trabajo2_CES2.modelo;

import java.util.List;

public class Fabrica implements InterfacePrincipal {
    private String nombre;
    private List<Reciclaje> listaReciclajes;

    public Fabrica(String nombre, List<Reciclaje> listaReciclajes)
    {
        this.nombre = nombre;
        this.listaReciclajes = listaReciclajes;
    }

    @Override

    public String getNombre() { return nombre; }

    @Override
    public List<Reciclaje> getListaReciclajes() { return listaReciclajes; }


    @Override
    public String separar(List<Reciclaje> reciclajes) {
        return "La Fabrica " + nombre + " esta separando " + reciclajes.size() + " elementos";

    }

    @Override
    public String procesar(List<Reciclaje> reciclajes) {

        return "La Fbrica " + nombre + " está procesando con maquinaria";
    }

    @Override

    public String reutilizar(List<Reciclaje> reciclajes) {

        return "La Fabrica " + nombre + " transformo materiales en nuevos productos";

    }
}
