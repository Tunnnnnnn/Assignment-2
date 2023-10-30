/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tunya
 */
public class DatabaseOperation 
{
    private DataBase_Manager dbManager;
    
    public DatabaseOperation()
    {
        dbManager = new DataBase_Manager();
    }
    
    public void createTable()
    {
        try {
            Statement statement = dbManager.getConnection().createStatement();
            String newTableName = "LAPTOP";
            
            String sqlCreate = "create table" + newTableName + "(ID int not null,"
                    + "Manufacturer varchar(20), Product varchar(20),"
                    + "Price int, PRIMARY KEY (ID))";
            statement.executeUpdate(sqlCreate);
            
            String sqlInsert = "insert into" + newTableName + " values("
                    +"1, 'Acer', 'Nitro5', 1000),"
                    +"("
                    +"2, 'Microsoft', 'Surface', '1200)";
            statement.executeUpdate(sqlInsert);
            
            String sqlUpdateTable = "update " + newTableName + " set price=1340 "
                    + "where manufacturer='Acer' and model='Nitro5'";
            
            statement.executeUpdate(sqlUpdateTable);
            System.out.println("Table created");
            
            
        }
        catch (SQLException ex)
        {
            
        }
    }
    
    public void getQuery()
    {
        ResultSet rs = null;
        
        try 
        {
            System.out.println("Getting query");
            Statement statement = dbManager.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            String sqlQuery = "select product, price from laptop "
                    + "where manufacturer='Acer'";
            
            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            
            while (rs.next()) {
                String product = rs.getString("product"); // 1
                int price = rs.getInt(2);
                System.out.println(product + ":  $" + price);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("failed");
        }
    }
    
    public static void main(String[] args)
    {
        DatabaseOperation dboperation = new DatabaseOperation();
        dboperation.createTable();
        dboperation.getQuery();
        dboperation.dbManager.close();
    }
    
}
