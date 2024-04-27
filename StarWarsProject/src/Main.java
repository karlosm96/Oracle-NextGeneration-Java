import alu.models.Movie;
import alu.models.Title;
import alu.models.TitleSWAP;
import alu.services.CreateJsonFile;
import alu.services.FetchAPI;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int inChoise;
        List<Title> moviesList = new ArrayList<>();

        Gson gson = new GsonBuilder().
                //setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                setPrettyPrinting().
                create();

        while (true){
            System.out.println("Porfavor ingrese el numero de la pelicula de estar wars que desea ver: ");
            inChoise = scanner.nextInt();

            if(inChoise > 0 && inChoise < 7){
                break;
            }

            System.out.println("Ingrese una opcion valida");
        }

        String url = "https://swapi.py4e.com/api/films/" + inChoise + "/";

        FetchAPI fetchAPI = new FetchAPI(url);
        fetchAPI.fetchData();
        String movieData = fetchAPI.getHttpBody();

        TitleSWAP newTitleSWAP = gson.fromJson(movieData, TitleSWAP.class);

        Movie newMovie = new Movie(newTitleSWAP);
        moviesList.add(newMovie);

        CreateJsonFile createJsonFile = new CreateJsonFile(moviesList,
                "C:\\Users\\hp\\Desktop\\Java\\Oracle Alura\\StarWarsProject\\src",
                "movies.json");
        createJsonFile.create();
    }
}