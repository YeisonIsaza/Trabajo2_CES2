package com.poliCES2.trabajo2_CES2.repositories;
import com.poliCES2.trabajo2_CES2.modelo.*;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


@Repository
public class DatosRepository {


    private List<InterfacePrincipal> listaObjetos = new ArrayList<>();

    public DatosRepository() {

        List<Reciclaje> lista0 = new ArrayList<>();
        List<Reciclaje> lista1 = Arrays.asList(new Reciclaje("Plástico", 10));
        List<Reciclaje> lista2 = Arrays.asList(new Reciclaje("Cartón", 5), new Reciclaje("Vidrio", 8));
        List<Reciclaje> lista3 = Arrays.asList(new Reciclaje("Papel", 2), new Reciclaje("Metal", 15), new Reciclaje("Plástico", 7));
        List<Reciclaje> lista4 = Arrays.asList(new Reciclaje("Vidrio", 3), new Reciclaje("Cartón", 12), new Reciclaje("Metal", 20), new Reciclaje("Electrónico", 5));
        List<Reciclaje> lista5 = Arrays.asList(new Reciclaje("Papel", 6), new Reciclaje("Plástico", 9), new Reciclaje("Vidrio", 1), new Reciclaje("Metal", 4), new Reciclaje("Cartón", 8));

        listaObjetos.add(new Fabrica("Fabrica Norte", lista0));
        listaObjetos.add(new Ciudadano("Juan Perez", lista1));
        listaObjetos.add(new Robot("WallE", lista2));

        listaObjetos.add(new Fabrica("Fabrica Sur", lista3));
        listaObjetos.add(new Ciudadano("Mario Sanchez", lista4));
        listaObjetos.add(new Robot("Robotsito", lista5));
        listaObjetos.add(new Fabrica("Fabrica Copacabana", lista0));
        listaObjetos.add(new Ciudadano("Carlos Mario", lista1));
        listaObjetos.add(new Robot("Terminator", lista2));
        listaObjetos.add(new Fabrica("Fabrica Envigado", lista3));
        listaObjetos.add(new Ciudadano("Anais", lista4));
        listaObjetos.add(new Robot("Astroboy", lista5));
    }


    public List<InterfacePrincipal> getListaObjetos() {


        return listaObjetos;
    }



    public void imprimirMensajesHerencia() {

        System.out.println("PRUEBA DE METODOS HEREDADOS");

        for(InterfacePrincipal obj : listaObjetos) {
            System.out.println("Objeto: " + obj.getNombre());
            System.out.println(obj.separar(obj.getListaReciclajes()));
            System.out.println(obj.procesar(obj.getListaReciclajes()));
            System.out.println(obj.reutilizar(obj.getListaReciclajes()));

        }
    }


}
