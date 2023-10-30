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
public class Menu {

   public static ContactInformation contactMenu = new ContactInformation("","","");

   public static void shoppingCart()
   {
        System.out.println("Shopping Cart");
   }
   public static void checkout()
   {
        System.out.println("Checkout");   
   }
   public static void ContactInformation()
   {
        System.out.println("Contact Information page");
        System.out.println(contactMenu.toString());    
   }
}
