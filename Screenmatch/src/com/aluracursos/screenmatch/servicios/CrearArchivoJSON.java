package com.aluracursos.screenmatch.servicios;

import com.aluracursos.screenmatch.modelos.Titulo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivoJSON {
    private String peliculas;
    private String path;
    private String nombreArchivo;

    public CrearArchivoJSON(String peliculas, String path, String nombreArchivo) {
        this.peliculas = peliculas;
        this.path = path;
        this.nombreArchivo = nombreArchivo;
    }

    public void crear() throws IOException {
        if(!(new File(this.path).exists())){
            FileWriter newFile = new FileWriter(this.nombreArchivo);
            newFile.write(this.peliculas);
            newFile.close();
        }else{
            System.out.println("Error: ya existe un archivo con ese nombre");
        }
    }
}
