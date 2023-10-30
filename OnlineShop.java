/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author tunya
 */
public class OnlineShop 
{

    //Instance variables
    private int myProduct; 
    private Product[] inventory_array;
	
	//set up the default constructor
    public OnlineShop()
    {
        this.myProduct = 0;
        this.inventory_array = new Product[5];		
    }
	
	//add method will add product to the inventory array
    public void add(Product product)
    {
	if (myProduct < inventory_array.length)
        {
            inventory_array[myProduct] = product;
            myProduct++;
	}
    }
	
	//String class will read through the array 
    public String toString()
    {
	String space = "";
	for (int i = 0; i < inventory_array.length; i++)
	{
            space += i + 1 +": ";
            space += this.inventory_array[i]+ "\n";
	}
	return space;
    }
	
	//getProduct class will take integer between 1 to 5 and return the corresponding
    public Product getProduct(int num)
    {
        if (num < 5 && num >= 0)
	{
            return this.inventory_array[num];
	}
	else
	{
            return null;
	}
    }
}  

