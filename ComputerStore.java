/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author jamez
 */

import static Assignment1.Menu.ContactInformation;
import static Assignment1.Menu.checkout;
import static Assignment1.Menu.shoppingCart;
import java.util.*;

public class ComputerStore 
{   
    public static ContactInformation contactMenu = new ContactInformation("","","");
    private static ShoppingCart shoppingCart = new ShoppingCart();
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException
   {
      while (true)
      {
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:clddxkkkkkkkxxdolc:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;:ldxO00KKKK00000KKKKK00Oxoc:;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;ldk00K00OkxdoolllooddxkO0KK0Oxo:;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;:lx0K00Oxoc:;;;;;,,;;;;;;:cldk00K0Oo:;;,;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;cxOK00koc;;;;;;;;;;;;;;;;;;;;;:lxOKK0kc;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;lO000ko:;;;;;;;;;;;;;;;;cdxxdc;;;;ckKK0Ol;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;oO0K0x:;;;;;;;;;;;;;;,;;,lO000o;;;;;:d0K0Oo;,;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;lO0K0d:;;;;;;,;;;;;;;;;;;;l0K00o;;;;;;:d00Kkc;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;ck0K0x:;;;;;;clddxxdol:;;;;lOKK0o;;;;;;;ckKK0d;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;o0KKOl;;;;;cxO00KKKK00kxo:,o0KK0o;;;;;;;;d00Kk:,;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;:xKKKx:;;;;ck0K0Okxxk0000Od:l0K00o;;;;;;;;o0KKOc,;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;:kK00d;;;;;o0K00o;;;:x0KKKkcl0KK0o;;;;;;;;o0K0Oc,;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;,:kKK0d:;;;;o0KKOl;;;;d0KKKkcl0KK0o;;;;;;;ckKK0x:;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;:d0K0xc;;;;o0KK0l;;;:dKKKKOclOKK0x:;;;;:lk0K0Ol;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;lO000o;;;;o0KK0l;;;:xKKKKk::x00K0Oxxxkk00K0kl;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;:d000Ol;;;lO0KOl;;;;d00K0kc,cdk00KK0KK00Oko:;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;:x0KKkl;;coool:;;;;coodol:;;;:cloooooolc:;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;:x00KOd:;,;;;;;;;;;;;;;;;;;;;;;;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;:oOK00koc;,;;;;;;;;;;;;;;;;;;;;;;coddol:;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;,;lxO0K0Odl:;;;;;;;;;;;;;;;;;:cox0KK0ko:;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;:cdO0KK0Oxdolc:::::::cclodk000K0ko:;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;coxO00KK000OOOkOOOO00K000Okdl:;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;cloxxkO0000KK000OOkxdlc:;;;;;;;;;,;;;;;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:cccloolllcc:;;;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        
        
        
        System.out.println("Welcome to Computer Tech Online Store \n");
        
        
        System.out.println("Please select one option");
        System.out.println("1) Product page");
        System.out.println("2) View shopping cart");
        System.out.println("3) Checkout");
        System.out.println("4) Contact");
        System.out.println("5) Exit");
        
        try{
         int input = scan.nextInt();

         switch (input) {
             case 1:
                 products();
                 break;

                 case 2:
                 viewShoppingCart();
                 Thread.sleep(2000);
                 break;

                 case 3:
                 Checkout();
                 break;

                 case 4:
                 ContactInformation();
                 Thread.sleep(2000);
                 break;

                 case 5:
                 return;

             default:
                 throw new AssertionError();
         }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input, please enter a number!");
            scan.nextLine();
        }
       }  
   }
   
   public static void products() throws InterruptedException
   {
        System.out.println("you are in product page, select one option");
        System.out.println("A) Display laptop products");
        System.out.println("B) Display PC parts");
        System.out.println("C) Display Tablets product");
        System.out.println("D) Exit to main menu");
        
        String userinput = scan.next();
        char character = userinput.charAt(0);
        
        try
        {
        switch (character)
        {
            case 'a':
            case 'A':
                System.out.println("You've selected Display laptop products!");
                System.out.println("laptop product displayed below \n");
                
                List<Product> laptops = Laptop.laptop();
                for (Product laptop : laptops)
                {
                    System.out.println(laptop);
                }
                
                System.out.println("Which product would you like to add to cart? Select from 1 - 5");
                int laptopinput = scan.nextInt();
                
                if (laptopinput >= 1 && laptopinput <= laptops.size()) 
                {
                    Product selectedLaptop = laptops.get(laptopinput - 1);
                    shoppingCart.addItem(selectedLaptop);
                    System.out.println("Item added to the shopping cart.");
                    Thread.sleep(2000);
                 } 
                else 
                {
                    System.out.println("Invalid selection.");
                    Thread.sleep(2000);
                }
                
                break;
            case 'b':
            case 'B':
                System.out.println("You've selected Display PC parts!");
                System.out.println("PC parts displayed below \n");
                
                List<Product> parts = PcParts.part();
                for(Product part : parts)
                {
                    System.out.println(part);
                }
                
                System.out.println("Which product would you like to add to cart?");
                int partinput = scan.nextInt();
                
                if (partinput >= 1 && partinput <= parts.size())
                {
                    Product selectedPart = parts.get( partinput - 1);
                    shoppingCart.addItem(selectedPart);
                    System.out.println("Item added to the shopping cart");
                    Thread.sleep(2000);
                }
                else
                {
                    System.out.println("Invalid selection");
                    Thread.sleep(2000);
                }
                break;
                
            case 'c':
            case 'C':
                System.out.println("You've selected Display Tablet products");
                
                List<Product> tablets = Tablets.tablet();
                for(Product tablet : tablets)
                {
                    System.out.println(tablet);
                }
                
                System.out.println("Which product would you like to add to cart?");
                int tabletsinput = scan.nextInt();
                
                if (tabletsinput >= 1 && tabletsinput <= tablets.size())
                {
                    Product selectedtablet = tablets.get(tabletsinput - 1);
                    shoppingCart.addItem(selectedtablet);
                    System.out.println("Item added to the cart");
                    Thread.sleep(2000);
                }
                else
                {
                    System.out.println("Invalid selection");
                    Thread.sleep(2000);
                }
                
                break;
                
            case 'd':
            case 'D':
                break;
                        
            default:
         
                System.out.println("Invalid input");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input, Please input a letter!");      
        }
   }
   
   public static void viewShoppingCart() 
   {
       shoppingCart.viewCart();
   }
   
   public static void Checkout() throws InterruptedException
   {
    try {
        shoppingCart.checkout();
       
        System.out.println("how would you like to proceed");
        System.out.println("1: Delivery");
        System.out.println("2: Click & Collect");
        System.out.println("3: Exit to main menu");
       
        int input = scan.nextInt();
       
        if (input == 1)
        {
            System.out.println("Please input payment card details");
            int card = scan.nextInt();
           
            System.out.println("Thanks for shopping with us");
        }
       
        if (input == 2)
        {
            System.out.println("Please input payment card details");
            int card = scan.nextInt();
           
            System.out.println("Here is your Pick up details");
            ContactInformation(); 
            Thread.sleep(4000);
        }
        
        if (input == 3)
        {
            return;
        }
    } catch (AssertionError e) {
        System.err.println("Invalid order, try again without spacing: " + e.getMessage());
    }

   }
}
