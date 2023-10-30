package Assignment1;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private int id;
    private String model;
    private String brand;
    private double price;

    public Laptop(int id, String model, String brand, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

        public static List<Laptop> laptopz() {
        List<Laptop> laptops = new ArrayList<>(); 

        // this will Connect to the database
        DataBase_Manager dbManager = new DataBase_Manager();
        Connection conns = dbManager.connect();

        try {
            // Execute the SQL query to retrieve tablet data from the database
            String query = "SELECT * FROM Laptop";
            java.sql.Statement stmt = conns.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            
            while (rs.next()) {
                int id = rs.getInt("id");
                String model = rs.getString("model");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");

                Laptop laptopz = new Laptop(id, model, brand, price);
                laptops.add(laptopz);
            }

           
            rs.close();
            stmt.close();
            dbManager.close(conns);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return laptops;
    }

public static void main(String[] args) {
    List<Laptop> laptops = laptopz();

    // Print out the laptop information
    for (Laptop laptop : laptops) {
        System.out.println("ID: " + laptop.getId());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println();
    }
}

}

//------------------------------------------------------------------
