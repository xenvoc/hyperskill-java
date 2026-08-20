package org.spring.servingfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;

@SpringBootApplication
public class ServingFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServingFilesApplication.class, args);
        Path path = Path.of("files", "example.txt");
    }

}
