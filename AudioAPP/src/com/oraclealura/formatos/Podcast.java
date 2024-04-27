package com.oraclealura.formatos;

public class Podcast extends Audio{
    private String descripcion;
    private int numero;

    public Podcast(String nombre, String autor, int duracionEnMinutos, int numero) {

        super(nombre, "Podcast", autor, duracionEnMinutos);
        this.setNumero(numero);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
