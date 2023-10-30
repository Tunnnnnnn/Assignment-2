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
public class PcParts 
{
    public static List<Product> part()
    {
        List<Product> parts = new ArrayList<>();
        
        parts.add(new Product(" GTX3070", "EVGA", 600));
        parts.add(new Product(" Core I5", "Intel", 300));
        parts.add(new Product(" GTX4090", "Nvidia", 1400));
        parts.add(new Product(" GTX1080", "Nvidia", 500));
        parts.add(new Product(" GTX980ti", "Nvidia", 400));
     
        
        return parts;
    }    
    
}
