package part1.lesson19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Task1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBUnit dbUnit = new DBUnit ();
        MethodsUnitDemo methodsUnitDemo = new MethodsUnitDemo ();
        Connection connection = DriverManager.getConnection ( "jdbc:postgresql://localhost:5432/1",
                "postgres",
                "postgres" );
        dbUnit.createDB ( connection );


        methodsUnitDemo.batchingMethod ( connection );

        methodsUnitDemo.someActionMethods ( connection );


    }
}
