package com.poliCES2.trabajo2_CES2.controlador;
import com.poliCES2.trabajo2_CES2.modelo.InterfacePrincipal;
import com.poliCES2.trabajo2_CES2.modelo.Reciclaje;

import com.poliCES2.trabajo2_CES2.repositories.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ReciclajeController {


    @Autowired
    private DatosRepository repository;

    @GetMapping("/")
    public String index() {
        repository.imprimirMensajesHerencia();
        return "index";
    }

    @GetMapping("/peticion1")
    public String peticion1(Model model) {
        String nombres = repository.getListaObjetos().stream()
                .map(InterfacePrincipal::getNombre)
                .collect(Collectors.joining(", "));
        model.addAttribute("resultado", nombres);
        return "peticion1";
    }


    private List<Reciclaje> obtenerTodosLosReciclajes() {
        List<Reciclaje> todos = new ArrayList<>();
        for (InterfacePrincipal obj : repository.getListaObjetos()) {

            todos.addAll(obj.getListaReciclajes());

        }
        return todos;
    }


    @GetMapping("/peticion2")
    public String peticion2(Model model) {

        IntSummaryStatistics stats = obtenerTodosLosReciclajes().stream()
                .mapToInt(Reciclaje::getPesoKg)
                .summaryStatistics();

        model.addAttribute("conteo", stats.getCount());
        model.addAttribute("suma", stats.getSum());
        model.addAttribute("promedio", stats.getAverage());
        model.addAttribute("min", stats.getMin());
        model.addAttribute("max", stats.getMax());
        return "peticion2";
    }


    @GetMapping("/peticion3")
    public String peticion3(Model model) {
        List<String> materiales = obtenerTodosLosReciclajes().stream()
                .map(Reciclaje::getMaterial)
                .collect(Collectors.toList());
        model.addAttribute("materiales", materiales);
        return "peticion3";
    }


    @GetMapping("/peticion4")
    public String peticion4(Model model) {
        List<Reciclaje> lista = obtenerTodosLosReciclajes();

        boolean hayMaterialPesado = lista.stream().anyMatch(r -> r.getPesoKg() > 15);
        boolean hayCarton = lista.stream().anyMatch(r -> r.getMaterial().equals("Cartón"));
        boolean noHayNegativos = lista.stream().noneMatch(r -> r.getPesoKg() < 0);

        model.addAttribute("hayMaterialPesado", hayMaterialPesado);
        model.addAttribute("hayCarton", hayCarton);
        model.addAttribute("noHayNegativos", noHayNegativos);
        return "peticion4";
    }


    @GetMapping("/peticion5")
    public String peticion5(Model model) {
        Reciclaje mayorPeso = obtenerTodosLosReciclajes().stream()
                .max(Comparator.comparing(Reciclaje::getPesoKg))
                .orElse(null);

        model.addAttribute("mayor", mayorPeso);
        return "peticion5";
    }
}