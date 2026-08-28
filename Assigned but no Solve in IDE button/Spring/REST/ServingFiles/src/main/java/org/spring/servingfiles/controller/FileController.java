package org.spring.servingfiles.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.IOException;
import java.io.InputStream;
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

    @GetMapping("/stream")
    public ResponseEntity<StreamingResponseBody> stream() {
        Path path = Path.of("data", "bigdata.zip");

        Resource resource = new FileSystemResource(path);

        StreamingResponseBody responseBody = outputStream -> {
            try (InputStream inputStream = resource.getInputStream())  {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                //handle it
            }
        };

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        try {
            headers.setContentLength(resource.contentLength());
        } catch (IOException e) {
            // handle again
        }
        headers.setContentDispositionFormData("attachment", resource.getFilename());

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(responseBody);
    }

}
