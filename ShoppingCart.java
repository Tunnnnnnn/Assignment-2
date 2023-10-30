/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.*;

/**
 *
 * @author jamez
 */
public class ShoppingCart {
    
    List<Product> items;
    
    public ShoppingCart()
    {
        items = new ArrayList<>();
    }
    
    public void addItem(Product product)
    {
        items.add(product);
    }
    
    public List<Product> getItems()
    {
        return items;
    }
    
    public double calculateTotalCost()
    {
        double totalCost = 0.0;
        
        for (Product item : items)
        {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
    
    public void viewCart()
    {
        System.out.println("Shopping Cart");
        
        for (Product item : items)
        {
            System.out.println(item.getManufacturer() + " " + item.getProduct() + " " + "$" + item.getPrice());
        }
        System.out.println("Total: " + calculateTotalCost());
        System.out.println("\n");
    }
    
    public void checkout()
    {
        System.out.println("Checkout list");
        
        for (Product item : items)
        {
            System.out.println(item.getManufacturer() + " " + item.getProduct() + " " + "$" + item.getPrice());
        }
        
        System.out.println("Total: " + calculateTotalCost());    
    }
   
    
}
