package org.Spring;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String sql = """
                    CREATE TABLE music.artists
                    (
                            id  INTEGER PRIMARY KEY,
                            name TEXT NOT NULL,
                            origin TEXT,
                            songs_number INTEGER
                    );
        """;

        String url = "jdbc:postgresql://localhost:5253/my_db";

        try (Connection con = DriverManager.getConnection(url, "username", "password"); Statement statement = con.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}