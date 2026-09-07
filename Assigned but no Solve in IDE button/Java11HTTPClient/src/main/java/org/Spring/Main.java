package org.Spring;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();

        URI firstWebAddr = URI.create("http://info.cern.ch/hypertext/WWW/TheProject.html");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(firstWebAddr)
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println("Can't access site, try later");
        }
    }
}