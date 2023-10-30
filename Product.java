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
    
    private String product;
    private String manufacturer;
    private double price;

// Constructor
    public Product(String product, String manufacturer, double price) 
    {
        this.setProduct(product);
        this.setManufacturer(manufacturer);
        this.setPrice(price);
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
        return getProduct() + ", " + getManufacturer() + ", $" + getPrice();
    }   
}

    
    
    

