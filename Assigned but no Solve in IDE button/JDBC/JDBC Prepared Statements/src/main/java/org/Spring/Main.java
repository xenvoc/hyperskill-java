package org.Spring;


import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
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
        Connection con = DriverManager.getConnection(url, "user", "password");

        try (Statement statement = con.createStatement()) {
            statement.executeUpdate("INSERT INTO artists (name, origin, songs_number) VALUES " +
                    "('The Beatlers', 'Liv-pool, Englandia', 123)");
        }

        String insert = "INSERT INTRO artists (name, origin, songs_number) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(insert)) {
            preparedStatement.setString(1, "The Beatloviches");
            preparedStatement.setString(2, "Livpoolie, Englond");
            preparedStatement.setInt(3, 213);

            preparedStatement.executeUpdate();
        }

        String updateOrigin = "UPDATE artists SET origin = ? WHERE id = ?";

        try (PreparedStatement praparedStatement = con.preparedStatement(updateOrigin)) {
            preparedStatement.setObject(1, new StringBuilder("Mdonner"));
            preparedStatement.setObject(2, new Long(83));

            preparedStatement.executeUpdate();
        }
    }
}