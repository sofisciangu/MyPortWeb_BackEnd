package com.scianguweb.sciangulasofia.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoPersona {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;

    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
