package Assignment1;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tablets {
    public static List<Tablet> tablet() {
        List<Tablet> tablets = new ArrayList<>(); 

        // this will Connect to the database
        DataBase_Manager dbManager = new DataBase_Manager();
        Connection conn = dbManager.connect();

        try {
            // Execute the SQL query to retrieve tablet data from the database
            String query = "SELECT * FROM Tablet";
            java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            
            while (rs.next()) {
                int id = rs.getInt("id");
                String model = rs.getString("model");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");

                Tablet tablet = new Tablet(id, model, brand, price);
                tablets.add(tablet);
            }

           
            rs.close();
            stmt.close();
            dbManager.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tablets;
    }
    
    public static void main(String[] args) {
        List<Tablet> tablets = tablet();

        //it will Print the tablet array list information
        for (Tablet tablet : tablets) {
            System.out.println("ID: " + tablet.getId());
            System.out.println("Model: " + tablet.getModel());
            System.out.println("Brand: " + tablet.getBrand());
            System.out.println("Price: " + tablet.getPrice());
            System.out.println();
        }
    }
}
