/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import static Assignment1.ComputerStore.products;
import static Assignment1.ComputerStore.viewShoppingCart;
import static Assignment1.Menu.ContactInformation;
import static Assignment1.Menu.checkout;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 *
 * @author jamez
 */
public class Checkout {
    
    ShoppingCart totalCost = new ShoppingCart();
    
    public Scanner scan = new Scanner(System.in);
    
    
    public void checkoutpay(){
        
        
        System.out.println("Select payment: ");
        System.out.println("A: Credit Payment");
        System.out.println("B: Bank Transfer");
        
    }
    
    public void CheckoutMenu(){
        
        String sellection = scan.nextLine();
        try {
            
            switch (sellection) {
             case "A":
                 carPayment();
                 break;

                 case "a":
                 carPayment();
                 Thread.sleep(2000);
                 break;

                 case "B":
                 bankPayment(); 
                 break;

                 case "b":
                 bankPayment();
                 Thread.sleep(2000);
                 break;

                 case "c":
                 return;

             default:
                 throw new AssertionError();
         }
        } catch (Exception e) {
        }
    }
    
    
    public void bankPayment(){
        
        System.out.println("Bank Depsit");
        System.out.println("Please depsot " + totalCost.calculateTotalCost()+ "into this acount.");
        System.out.println("Acount Number: 234563 ASB");
        System.out.println("Your order is being process(should ship within 5-10 working days");
        
    }
    
    public void carPayment(){
        
        System.out.println("-----Card name: 'bob' card number: '123'");
        
        System.out.println("Card Payment");
        System.out.println("please enter details");
        System.out.println("Name: ");
        String Name = scan.nextLine();
        System.out.println("Card number: ");
        int cardnumber = scan.nextInt();
        
        if (Name == "bob" && cardnumber == 123) {
            System.out.println("Payment successful");
            System.out.println("Your order is being process(should ship within 5-10 working days");
        }else {
            System.out.println("Wrong Details.");
            carPayment();
        }
    }
    
}