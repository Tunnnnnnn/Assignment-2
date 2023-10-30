package Assignment1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jamez
 */
public class DataBase_Manager {
    private static final String USER_NAME = "shop"; //your DB username
    private static final String PASSWORD = "123456"; //your DB password
    private static final String URL = "jdbc:derby://localhost:1527/PC_Shop_App;create=true";  //url of the DB host
    
    Connection conn;
    
    public DataBase_Manager() 
    {
       establish();
    }
    
    public static void main(String[] args) 
    {
        DataBase_Manager dbManager = new DataBase_Manager();
        //You will find: org.apache.derby.client.net.NetConnection40@7fbe847c
        //That means: Connection conn = new NetConnection();
        System.out.println(dbManager.getConnection());

    }
    
    public Connection getConnection() 
    {
        return this.conn;
    }
    
    public void establish() 
    {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                //System.out.println(URL + "   CONNECTED....");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }
    
    public Connection connect() 
    {
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return conn;
    }
    
    public void close() 
    {
        if (conn != null) 
        {
            try 
            {
                conn.close();
            } catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
    public ResultSet myQuery(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void myUpdate(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}
