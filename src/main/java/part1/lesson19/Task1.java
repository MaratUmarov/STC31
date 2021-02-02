package part1.lesson19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Task1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connection= DriverManager.getConnection ( "jdbc:postgresql://localhost:5432/1",
        "postgres",
        "postgres" );
DBUnit.DBCreate ( connection );

        System.out.println (connection.getSchema ());

    }
}
