/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jamez
 */
public class Laptop 
{
   
    public static List<Product> laptop()
    {
        List<Product> laptops = new ArrayList<>();
        
        laptops.add(new Product(1,"Nitro 5", "Acer", 600));
        laptops.add(new Product(2,"ROG", "Asus", 1000));
        laptops.add(new Product(3,"Surface Pro", "Microsoft", 900));
        laptops.add(new Product(4,"XPS13", "Dell", 800));
        
        return laptops;
        
    }        
}
