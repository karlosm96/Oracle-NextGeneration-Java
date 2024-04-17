package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


    public Serie(String nombre, String fechaDeLanzamiento,
                 double duracionEnMinutos, boolean incluidoEnElPlan,
                 double sumaDeLasEvaluaciones, double totalDeLasEvaluaciones,
                 int temporadas, int episodiosPorTemporada, int minutosPorEpisodio){

        super(nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan,
                sumaDeLasEvaluaciones, totalDeLasEvaluaciones);

        this.setTemporadas(temporadas);
        this.setEpisodiosPorTemporada(episodiosPorTemporada);
        this.setMinutosPorEpisodio(minutosPorEpisodio);
    }

    private void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    private void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    private void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public void muestraFichaTecnica(){
        System.out.println(String.format("""
                El nombre de la serie es: %s
                Su fecha de lanzamiento es: %s
                Duracion en minutos: %.2f
                """, super.getNombre(), super.getFechaDeLanzamiento(), super.getDuracionEnMinutos()));
    }
}