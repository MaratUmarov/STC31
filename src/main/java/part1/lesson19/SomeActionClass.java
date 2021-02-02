package part1.lesson19;

import java.sql.*;

public class SomeActionClass {
    private static final String INSERT_SQL = "INSERT INTO taxi "
            + "(id_taxi,car,model,gosnumber) VALUES (?,?,?,?)";

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection ( "jdbc:postgresql://localhost:5432/1",
                "postgres",
                "postgres" )) {
            DBUnit.DBCreate ( conn );
            conn.setAutoCommit ( false );

            try (PreparedStatement insertStmt = conn.prepareStatement ( INSERT_SQL )) {
                // 1
                insertStmt.setInt ( 1, 19 );
                insertStmt.setString ( 2, "F1" );
                insertStmt.setString ( 3, "supercar" );
                insertStmt.setString ( 4, "A101GG116" );
                insertStmt.executeUpdate ();

                // 2
                insertStmt.setInt ( 1, 14 );
                insertStmt.setString ( 2, "BMW" );
                insertStmt.setString ( 3, "1 ser" );
                insertStmt.setString ( 4, "s678fg43" );
                insertStmt.executeUpdate ();

                // 3
                insertStmt.setInt ( 1, 10 );
                insertStmt.setString ( 2, "BMW" );
                insertStmt.setString ( 3, "4 Series" );
                insertStmt.setString ( 4, "B444kl116" );
                insertStmt.executeUpdate ();

                //  Savepoint
                Savepoint first_savepoint = conn.setSavepoint ( "first_savepoint" );

                // 4
                insertStmt.setInt ( 1, 32 );
                insertStmt.setString ( 2, "Chevrolette" );
                insertStmt.setString ( 3, "Cruize" );
                insertStmt.setString ( 4, "K123SS777" );
                insertStmt.executeUpdate ();

                //  Savepoint
                Savepoint second_savepoint = conn.setSavepoint ( "second_savepoint" );

                // 5
                insertStmt.setInt ( 1, 18 );
                insertStmt.setString ( 2, "BMW" );
                insertStmt.setString ( 3, "5series" );
                insertStmt.setString ( 4, "D555hgjk" );
                insertStmt.executeUpdate ();

                conn.releaseSavepoint ( second_savepoint );
                // Rollback
                conn.rollback ( first_savepoint );

                // Commit транзакции
                conn.commit ();
            }

        }
    }
}



