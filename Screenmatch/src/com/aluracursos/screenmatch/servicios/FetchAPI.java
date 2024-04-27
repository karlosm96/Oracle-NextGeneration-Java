package com.aluracursos.screenmatch.servicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchAPI { ;
    private String fullUrl;
    private String response;

    public FetchAPI(String url) throws IOException, InterruptedException {
        this.fullUrl = url;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(this.fullUrl)).
                build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        this.response = response.body();
    }

    public String getResponse() {
        return response;
    }
}
