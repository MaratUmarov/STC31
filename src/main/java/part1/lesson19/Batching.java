package part1.lesson19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batching {
    public static void main(String[] args) throws SQLException {
        Integer[] localArgs = new Integer[]{1, 2, 3, 4};
        try (Connection connection = DriverManager.getConnection (
                "jdbc:postgresql://localhost:5432/1",
                "postgres",
                "postgres" )) {
            DBUnit.DBCreate ( connection );
            try (PreparedStatement preparedStatement = connection.prepareStatement (
                    "update passengers set name_pass='Block' where pass_id = ?" )) {
                for ( Integer arg : localArgs ) {
                    preparedStatement.setInt ( 1, arg );
                    preparedStatement.addBatch ();
                }
                preparedStatement.executeBatch ();
            }
        }
    }
}
