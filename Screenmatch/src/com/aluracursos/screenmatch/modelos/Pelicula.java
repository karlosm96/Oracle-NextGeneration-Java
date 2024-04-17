package com.aluracursos.screenmatch.modelos;

public class Pelicula extends Titulo{
    private String director;

    public Pelicula(String nombre, String fechaDeLanzamiento,
                    double duracionEnMinutos, boolean incluidoEnElPlan,
                    double sumaDeLasEvaluaciones, double totalDeLasEvaluaciones,
                    String director){

        super(nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan,
                sumaDeLasEvaluaciones, totalDeLasEvaluaciones);
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
                """, super.getNombre(), super.getFechaDeLanzamiento(), super.getDuracionEnMinutos()));
    }
}
