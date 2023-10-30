/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author jamez
 */
public class ContactInformation {
    
    private String address;
    private String PhoneNumber;
    private String eMail;

    public ContactInformation(String address, String PhoneNumber, String eMail) 
    {
        this.address = "55 Queen St, Aucland";
        this.PhoneNumber = "05 321456";
        this.eMail = "computer_store@gmail.com";
    }
//getters for Adress, Phone NUmber and Email.
    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return "Contact Information: " + "\nAddress: " + address + " \nPhoneNumber: " + PhoneNumber + " \nEmail: " + eMail + "\n";
    }
    
    
    
    
}
