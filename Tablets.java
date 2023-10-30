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
public class Tablets
{
    public static List<Product> tablet()
    {
        List<Product> tablets = new ArrayList<>();
        
        tablets.add(new Product(1,"1. iPad", "Apple", 600));
        tablets.add(new Product(2,"2. iPad Air", "Apple", 1000));
        tablets.add(new Product(3,"3. Galaxy Tab", "Samsung", 900));
        tablets.add(new Product(4,"4. M8", "Lenevo", 800));
        
        return tablets;
        
    }
}
    
    
   
    
    

    
    

