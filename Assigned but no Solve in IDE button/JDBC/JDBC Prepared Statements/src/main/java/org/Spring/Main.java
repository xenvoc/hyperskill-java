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
        try {
            Connection con = DriverManager.getConnection(url, "user", "password");




            try (Statement statement = con.createStatement()) {
                statement.executeUpdate("INSERT INTO artists (name, origin, songs_number) VALUES " +
                        "('The Beatlers', 'Liv-pool, Englandia', 123)");
            }

            String insert = "INSERT INTO artists (name, origin, songs_number) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = con.prepareStatement(insert)) {
                preparedStatement.setString(1, "The Beatloviches");
                preparedStatement.setString(2, "Livpoolie, Englond");
                preparedStatement.setInt(3, 213);

                preparedStatement.executeUpdate();
            }

            String updateOrigin = "UPDATE artists SET origin = ? WHERE id = ?";

            try (PreparedStatement preparedStatement = con.prepareStatement(updateOrigin)) {
                preparedStatement.setString(1, "Mdonner");
                preparedStatement.setInt(2, 83);

                preparedStatement.executeUpdate();
            }

            String insert2 = "INSERT INTO artists (name, songs_number) VALUES (?, ?)";

            try (PreparedStatement preparedStatement = con.prepareStatement(insert2)) {
                preparedStatement.setString(1, "Madonner");
                preparedStatement.setInt(2, 88);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }



    }
}