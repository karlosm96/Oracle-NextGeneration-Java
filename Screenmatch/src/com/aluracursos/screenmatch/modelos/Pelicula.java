package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public Pelicula(String nombre, int añoDeLanzamiento,
                    double duracionEnMinutos, boolean incluidoEnElPlan,
                    String director){

        super(nombre, añoDeLanzamiento, duracionEnMinutos, incluidoEnElPlan);
        this.setDirector(director);
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void muestraFichaTecnica(){
        System.out.println(String.format("""
                El nombre de la pelicula es: %s
                Su fecha de lanzamiento es: %s
                Duracion en minutos: %.0f
                """, super.getNombre(), super.getAñoDeLanzamiento(), super.getDuracionEnMinutos()));
    }

    @Override
    public int getClasificacion(){
        return (int) (super.calculaMedia() / 2);
    }
}
