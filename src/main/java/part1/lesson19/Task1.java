package part1.lesson19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Task1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBUnit dbUnit = new DBUnit ();
        BatchingMethod batchingMethod = new BatchingMethod ();

        Connection connection = DriverManager.getConnection ( "jdbc:postgresql://localhost:5432/1",
                "postgres",
                "postgres" );
        dbUnit.createDB ( connection );
        batchingMethod.setSQL_EXPR ( "update passengers set name_pass='Block' where pass_id = ?" );
        batchingMethod.setIntegersToUpdateRow ( 4 );
        batchingMethod.batchingMethod ( connection, batchingMethod.getSQL_EXPR (),
                batchingMethod.getIntegersToUpdateRow () );
        SomeActionMethods actionMethods=new SomeActionMethods ();
        actionMethods.someActionMethods ( connection );

    }
}
