package org.spring.connectdbwjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectDBwJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectDBwJdbcApplication.class, args);
        String url = "jdbc:sqlite:path-to-database";




    }

}
