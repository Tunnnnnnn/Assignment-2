/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author jamez
 * 
 */
public class Product 
{
    private final int id;
    private String product;
    private String manufacturer;
    private double price;

    public Product(int id) 
    {
        this.id = id;
    }
    
// Constructor
    public Product(int id, String product, String manufacturer, double price) 
    {
        this.id = id;
        this.product = product;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    
    public int getId() 
    {
        return id;
    }
    
// product getter
    public String getProduct() 
    {
        return product;
    }
// Price getter
    public double getPrice() 
    {
        return price;
    }
    
    public String getManufacturer()
    {
        return manufacturer;
    }
    
// product setter
    public void setProduct(String product) 
    {
        this.product = product;
    }
// Price setter 
    public void setPrice(double price) 
    {
        this.price = price;
    }
    
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString()
    {
        return "ID: " + id + getProduct() + ", " + getManufacturer() + ", $" + getPrice();
    }   
}

    
    
    

