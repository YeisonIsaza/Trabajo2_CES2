package com.poliCES2.trabajo2_CES2.modelo;

public class Reciclaje {
    private String material;
    private Integer pesoKg;

    public Reciclaje(String material, Integer pesoKg) {
        this.material = material;
        this.pesoKg = pesoKg;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public Integer getPesoKg() { return pesoKg; }
    public void setPesoKg(Integer pesoKg) { this.pesoKg = pesoKg; }
}
