package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private int temporada;
    private Serie serie;
    private int totalVisualizaciones;

    public Episodio(int numero, String nombre, int temporada, Serie serie){
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setSerie(serie);
        this.setTemporada(temporada);
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (this.totalVisualizaciones > 100){
            return 4;
        } else if (this.totalVisualizaciones >50 && this.totalVisualizaciones <= 70) {
            return 3;
        } else {
            return 1;
        }
    }
}
