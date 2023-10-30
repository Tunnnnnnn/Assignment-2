/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author jamez
 */

    
public class ContactDetails {
    private String address;
    private String city;
    private String phone;
    private String email;

    // Constructor
    public ContactDetails(String address, String city, String phone, String email) {
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

//    ContactDetails() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    // Getters and setters

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    
        
        
    
   public static ArrayList<ContactDetails> getAllContactDetails() throws SQLException {
        DataBase_Manager dbManager = new DataBase_Manager();
        Connection conn = dbManager.connect();
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From CONTACT_INFORMATION";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<ContactDetails> contactDetailsList = new ArrayList<>();
        while (rst.next()) {
            ContactDetails contactDetails = new ContactDetails(rst.getString("address"), rst.getString("city"), rst.getString("phone"), rst.getString("email"));
            contactDetailsList.add(contactDetails);
        }
        dbManager.close(conn);
        return contactDetailsList;
    }


   void displayContactDetails(ArrayList<ContactDetails> contactDetailsList, java.awt.List list1) {
        for (ContactDetails contactDetails : contactDetailsList) {
            list1.add("Address: " + contactDetails.getAddress());
            list1.add("nCity: " + contactDetails.getCity());
            list1.add("nPhone: " + contactDetails.getPhone());
            list1.add("nEmail: " + contactDetails.getEmail());
        }
     }
   
//   public static void printContactDetails(ArrayList<ContactDetails> contactDetailsList) {
//    for (ContactDetails contactDetails : contactDetailsList) {
//        System.out.println("Address: " + contactDetails.getAddress());
//        System.out.println("City: " + contactDetails.getCity());
//        System.out.println("Phone: " + contactDetails.getPhone());
//        System.out.println("Email: " + contactDetails.getEmail());
//    }
//}


//       public static void main(String[] args) {
//    try {
//        ArrayList<ContactDetails> contactDetailsList = getAllContactDetails();
//        printContactDetails(contactDetailsList);
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//}


    
}

    
    

