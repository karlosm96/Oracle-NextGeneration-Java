package com.oraclealura.formatos;

public class Audio {
    private String nombre;
    private String autor;
    private String formato;
    private int duracionEnMinutos;
    private int totalMeGusta;
    private int totalReproducciones;

    public Audio(String nombre, String formato, String autor,
                 int duracionEnMinutos){

        this.setNombre(nombre);
        this.setAutor(autor);
        this.setFormato(formato);
        this.setDuracionEnMinutos(duracionEnMinutos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void meGusta(){
        this.totalMeGusta = this.totalMeGusta + 1;
    }

    public int getTotalMegusta(){
        return this.totalMeGusta;
    }

    public void reproducir(){
        this.totalReproducciones = this.totalReproducciones + 1;
    }

    public int getTotalReproducciones(){
        return totalReproducciones;
    }

    public void descripcion(){
        System.out.println(String.format("""
                Nombre: %s
                Formato: %s
                Autor: %s
                """,
                this.getNombre(),
                this.getFormato(),
                this.getAutor())
        );
    }
}
