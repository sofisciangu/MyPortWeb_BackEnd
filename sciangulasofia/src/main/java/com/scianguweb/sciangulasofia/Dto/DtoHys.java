package com.scianguweb.sciangulasofia.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoHys {

    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    public DtoHys() {
    }

    public DtoHys(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

}
