package com.poliCES2.trabajo2_CES2.modelo;

import java.util.List;

public interface InterfacePrincipal extends InterfaceSeparar, InterfaceProcesar, InterfaceReutilizar {
    String getNombre();
    List<Reciclaje> getListaReciclajes();
}
