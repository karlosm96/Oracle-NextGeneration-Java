package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private String fechaDeLanzamiento;
    private double duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, String fechaDeLanzamiento,
                  double duracionEnMinutos, boolean incluidoEnElPlan){

        this.setNombre(nombre);
        this.setFechaDeLanzamiento(fechaDeLanzamiento);
        this.setDuracionEnMinutos(duracionEnMinutos);
        this.setIncluidoEnElPlan(incluidoEnElPlan);
        this.setSumaDeLasEvaluaciones(sumaDeLasEvaluaciones);
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
        this.totalDeLasEvaluaciones += totalDeLasEvaluaciones;
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
