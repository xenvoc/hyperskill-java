package org.Spring;

import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:/sqlite/westeros.db";

        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);

        try (Connection con = dataSource.getConnection()) {
            try (Statement statement = con.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS HOUSES(" +
                        "id INTEGER PRIMARY KEY," +
                        "name TEXT NOT NULL," +
                        "words TEXT NOT NULL)");
                int i = statement.executeUpdate("INSERT INTO HOUSES VALUES " +
                        "(1, 'Targ of KL', 'FireBloo')," +
                        "(2, 'Stark of Winterfell', 'Summer is Coming')," +
                        "(3, 'Lannister of Casterly Rock', 'Hear Me Roar!')");

                int u = statement.executeUpdate("UPDATE HOUSES " +
                        "SET words = 'Winter is coming' " +
                        "WHERE id = 2");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();


            }
    }
}