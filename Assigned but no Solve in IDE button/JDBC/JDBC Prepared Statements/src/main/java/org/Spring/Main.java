package org.Spring;


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

        try (Statement statement = con.createStatement()) {
            statement.executeUpdate(sql);
        }
    }
}