package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_Manager {
    private static final String USER_NAME = "shop"; // your DB username
    private static final String PASSWORD = "123456"; // your DB password
    private static final String URL = "jdbc:derby://localhost:1527/PC_Shop_App"; // url of the DB host

    public DataBase_Manager() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}