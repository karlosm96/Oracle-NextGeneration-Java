package com.oraclealura.formatos;

public class Cancion extends Audio {
    public boolean isASingle;
    public String album;
    public String genero;

    public Cancion(String nombre, String autor, int duracionEnMinutos,
                   boolean isASingle) {
        super(nombre, "Cancion", autor, duracionEnMinutos);

        this.isASingle = isASingle;
        this.genero = genero;
    }

    public boolean isASingle() {
        return isASingle;
    }

    public void setASingle(boolean ASingle) {
        isASingle = ASingle;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void descripcion() {
        super.descripcion();
    }
}
