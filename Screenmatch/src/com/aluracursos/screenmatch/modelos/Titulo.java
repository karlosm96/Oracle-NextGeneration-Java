package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exceptions.ErrorConversionEnMinutosException;

public class Titulo {
    private String nombre;
    private int añoDeLanzamiento;
    private double duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int añoDeLanzamiento,
                  double duracionEnMinutos, boolean incluidoEnElPlan){

        this.setNombre(nombre);
        this.setAñoDeLanzamiento(añoDeLanzamiento);
        this.setDuracionEnMinutos(duracionEnMinutos);
        this.setIncluidoEnElPlan(incluidoEnElPlan);
        this.setSumaDeLasEvaluaciones(sumaDeLasEvaluaciones);
    }

    public Titulo(TituloOmdb nuevoTituloOmdb) {
        this.setNombre(nuevoTituloOmdb.title());
        this.setAñoDeLanzamiento(Integer.valueOf(nuevoTituloOmdb.year()));
        if(nuevoTituloOmdb.runtime().contains("N/A")){
            throw new ErrorConversionEnMinutosException("Error: Error en la conversion de duracion, el campo contiene un 'N/A'");
        }
        this.setDuracionEnMinutos(Integer.valueOf(nuevoTituloOmdb.runtime().substring(0,3).replace(" ", "")));
    }

    public void muestraFichaTecnica(){};

    public void evalua(double nota){
        this.sumaDeLasEvaluaciones += nota;
        this.setTotalDeLasEvaluaciones(1);
    }

    public double calculaMedia(){
        return this.sumaDeLasEvaluaciones / getTotalDeLasEvaluaciones();
    }

    private void setDuracionEnMinutos(double duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private void setAñoDeLanzamiento(int fechaDeLanzamiento) {
        this.añoDeLanzamiento = fechaDeLanzamiento;
    }

    private void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setSumaDeLasEvaluaciones(double sumaDeLasEvaluaciones) {
        this.sumaDeLasEvaluaciones = sumaDeLasEvaluaciones;
    }

    private void setTotalDeLasEvaluaciones(double totalDeLasEvaluaciones) {
        this.totalDeLasEvaluaciones += totalDeLasEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public double getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    @Override
    public String toString() {
        return "{nombre='" + nombre +
                ", añoDeLanzamiento=" + añoDeLanzamiento +
                ", duracionEnMinutos=" + duracionEnMinutos +
                '}';
    }
}
