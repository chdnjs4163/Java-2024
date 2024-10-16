package jdbc;
import java.sql.*;

public class MianJDBCTest {

    public static void main(String[] args) {
        Connection con = JDBCconnector.getConnection();
    }
}
