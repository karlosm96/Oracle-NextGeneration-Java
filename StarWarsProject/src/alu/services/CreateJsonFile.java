package alu.services;

import alu.models.Title;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateJsonFile {
    private List<Title> movies;
    private String path;
    private String fileName;

    public CreateJsonFile(List<Title> movies, String path, String fileName){
        this.movies = movies;
        this.path = path;
        this.fileName = fileName;
    }

    public void create() throws IOException {
        File file = new File(this.path + "/" + this.fileName);
        if (!file.exists()) {
            Gson gson = new GsonBuilder().
                    setPrettyPrinting().
                    create();

            FileWriter newFile = new FileWriter(file);
            newFile.write(gson.toJson(this.movies));
            newFile.close();
            System.out.println("File created successfully.");
        } else {
            System.out.println("Error: file already exists.");
        }
    }
}
