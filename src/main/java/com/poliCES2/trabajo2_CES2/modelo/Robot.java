package com.poliCES2.trabajo2_CES2.modelo;

import java.util.List;


public class Robot implements InterfacePrincipal {
    private String nombre;

    private List<Reciclaje> listaReciclajes;

    public Robot(String nombre, List<Reciclaje> listaReciclajes) {
        this.nombre = nombre;

        this.listaReciclajes = listaReciclajes;
    }

    @Override
    public String getNombre() { return nombre; }


    @Override


    public List<Reciclaje> getListaReciclajes() { return listaReciclajes; }

    @Override
    public String separar(List<Reciclaje> reciclajes) {

        return "El Robot " + nombre + " usa sensores para separar " + reciclajes.size() + " elementos";
    }

    @Override

    public String procesar(List<Reciclaje> reciclajes) {
        return "El Robot " + nombre + " esta compactando la basura";

    }

    @Override

    public String reutilizar(List<Reciclaje> reciclajes) {
        return "El Robot " + nombre + " esta reutilizando partes metalicas";
    }
}
