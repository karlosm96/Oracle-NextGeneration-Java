package alu.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchAPI {
    private String url;
    private HttpResponse httpData;
    private String httpBody;


    public FetchAPI(String url){
        this.url = url;
    }

    public void fetchData() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(this.url)).
                build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            this.httpData = response;
            this.httpDataToString();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void httpDataToString(){
        if(this.httpData!=null && this.httpData.body()!=null){
            this.httpBody = this.httpData.body().toString();
        }else {
            this.httpBody = "";
        }
    }

    public HttpResponse getHttpData() {
        return httpData;
    }

    public String getHttpBody() {
        return httpBody;
    }
}
