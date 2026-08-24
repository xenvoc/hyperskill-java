package org.spring.servingfiles.controller;

import jakarta.annotation.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class FileController {
    @GetMapping(path="/download")
    public ResponseEntity<Resource> download() {
        Path path = Path.of("files", "example.txt");
        Resource file = new FileSystemResource(path);
        return ResponseEntity
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .header("Content-Disposition", "attachment; filename=" + file.getFilename())
                .body(file);
    }

}
