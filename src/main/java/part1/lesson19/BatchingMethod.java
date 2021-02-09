package part1.lesson19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchingMethod {
    private String SQL_EXPR;
    private Integer integersToUpdateRow;

    public String getSQL_EXPR() {
        return SQL_EXPR;
    }

    public void setSQL_EXPR(String SQL_EXPR) {
        this.SQL_EXPR = SQL_EXPR;
    }

    public Integer getIntegersToUpdateRow() {
        return integersToUpdateRow;
    }

    public void setIntegersToUpdateRow(Integer integersToUpdateRow) {
        this.integersToUpdateRow = integersToUpdateRow;
    }

    public void batchingMethod(Connection connection, String SQL_EXPR, Integer integers) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement (
                this.SQL_EXPR )) {
            for ( int arg = 0 ; arg <= integersToUpdateRow ; arg++ ) {

                preparedStatement.setInt ( 1, arg );
                preparedStatement.addBatch ();
            }
            preparedStatement.executeBatch ();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace ();
        }
    }

}
