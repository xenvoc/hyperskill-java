package org.spring.connectdbwjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class ConnectDBwJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectDBwJdbcApplication.class, args);
        String url = "jdbc:sqlite:path-to-database";

        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);

       try (Connection cn = dataSource.getConnection()) {
           if (cn.isValid(5)) {
               System.out.println("Con:valid");
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }

    }

}
