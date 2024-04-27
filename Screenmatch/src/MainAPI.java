import com.aluracursos.screenmatch.exceptions.ErrorConversionEnMinutosException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.aluracursos.screenmatch.servicios.CrearArchivoJSON;
import com.aluracursos.screenmatch.servicios.FetchAPI;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        List<Titulo> listaDePeliculas = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(true){
            System.out.println("Ingrese el nombre de la pelicula: ");
            String pelicula = scanner.nextLine();

            if(pelicula.equalsIgnoreCase("salir")){
                break;
            }

            try {
                String peliculaCodificada = URLEncoder.encode(pelicula, "UTF-8");
                String URL = "https://www.omdbapi.com/?t="+
                        peliculaCodificada+
                        "&apikey=a83c71ea";

                String fetchData = new FetchAPI(URL).getResponse();

                TituloOmdb nuevoTituloOmdb = gson.fromJson(fetchData, TituloOmdb.class);

                Titulo titulo = new Titulo(nuevoTituloOmdb);
                listaDePeliculas.add(titulo);

            }catch (NumberFormatException e){
                System.out.println("Error: Error de formato numerico");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error: Error de formato de argumento");
                System.out.println(e.getMessage());
            }catch (ErrorConversionEnMinutosException e){
                System.out.println(e.getMessage());
            }
        }

        CrearArchivoJSON archivoListaDePeliculas = new CrearArchivoJSON(gson.toJson(listaDePeliculas), "", "listaDePeliculas.json");
        archivoListaDePeliculas.crear();

        System.out.println("Se ha creado el nuevo archivo");

    }
}

/*


        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

        */