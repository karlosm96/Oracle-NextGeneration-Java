package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private String fechaDeLanzamiento;
    private double duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private double totalDeLasEvaluaciones;

    public Titulo(String nombre, String fechaDeLanzamiento,
                  double duracionEnMinutos, boolean incluidoEnElPlan,
                  double sumaDeLasEvaluaciones, double totalDeLasEvaluaciones){

        this.setNombre(nombre);
        this.setFechaDeLanzamiento(fechaDeLanzamiento);
        this.setDuracionEnMinutos(duracionEnMinutos);
        this.setIncluidoEnElPlan(incluidoEnElPlan);
        this.setSumaDeLasEvaluaciones(sumaDeLasEvaluaciones);
        this.setTotalDeLasEvaluaciones(totalDeLasEvaluaciones);
    }

    public void muestraFichaTecnica(){

    }

    public void evalua(double nota){

    }

    public double calculaMedia(){
        return 1.2;
    }

    private void setDuracionEnMinutos(double duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private void setFechaDeLanzamiento(String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
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
        this.totalDeLasEvaluaciones = totalDeLasEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
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
}
