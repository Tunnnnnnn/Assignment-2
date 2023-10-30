package Assignment1;

import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import static Assignment1.Menu.ContactInformation;
import static Assignment1.Menu.checkout;
import static Assignment1.Menu.shoppingCart;
/**
 *
 * @author tunya
 */
public class ComputerStoreGUI extends JFrame
{ 
    
    
    
    private JList<String> contactList;
    
    public ComputerStoreGUI()
    {
        JFrame frame = new JFrame("Computer Tech Online Store");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Computer Tech Online Store", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 35));
        label.setBounds(140, 10, 500, 40);
        frame.add(label);
            
        JButton productButton = new JButton("Product page");
        productButton.setBounds(180, 90, 150, 30);
        productButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                openProductsWindow();
            }
        });
        frame.add(productButton);
        
        
        JButton cartButton = new JButton("View shopping cart");
        cartButton.setBounds(180, 130, 150, 30);
        cartButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
            }
        });
        frame.add(cartButton);
        
        
        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setBounds(430, 90, 150, 30);
        checkoutButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        frame.add(checkoutButton);
        
        
        JButton contactButton = new JButton("Contact");
        contactButton.setBounds(430, 130, 150, 30);
        contactButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        frame.add(contactButton);
        
        
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(300, 450, 150, 30);
        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        frame.add(exitButton);
        
        
        frame.add(label);
        frame.setSize(800, 600);
        frame.setLocation(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);   
        
        contactList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(contactList);
        scrollPane.setBounds(50, 200, 700, 300); // adjust position and size as needed
        frame.add(scrollPane);
        
          contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Fetch contact details from database
                    ArrayList<ContactDetails> contactDetailsList = ContactDetails.getAllContactDetails();

                    // Convert contact details to strings
                    ArrayList<String> contactDetailsStrings = new ArrayList<>();
                    for (ContactDetails contactDetails : contactDetailsList) {
                        contactDetailsStrings.add("Address: " + contactDetails.getAddress()
                                + ", City: " + contactDetails.getCity()
                                + ", Phone: " + contactDetails.getPhone()
                                + ", Email: " + contactDetails.getEmail());
                    }

                    // Update JList with new data
                    DefaultListModel<String> listModel = new DefaultListModel<>();
                    for (String s : contactDetailsStrings) {
                        listModel.addElement(s);
                    }
                    contactList.setModel(listModel);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
            
    }
    
   public void openProductsWindow() {
    JFrame productFrame = new JFrame("Product Selection");
    productFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    productFrame.setLayout(null);

    JLabel productLabel = new JLabel("Product Page", SwingConstants.CENTER);
    productLabel.setFont(new Font("Serif", Font.BOLD, 35));
    productLabel.setBounds(140, 10, 500, 40);
    productFrame.add(productLabel);

    JButton buttonA = new JButton("Display laptop products");
    buttonA.setBounds(180, 90, 180, 30);
    productFrame.add(buttonA);

    // Create a DefaultListModel to store the product data
    DefaultListModel<String> listModel = new DefaultListModel<>();

   buttonA.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Fetch laptop data from database
        List<Laptop> laptops = Laptop.laptopz();

        // Convert laptop data to strings
        ArrayList<String> laptopStrings = new ArrayList<>();
        for (Laptop laptop : laptops) {
            laptopStrings.add("ID: " + laptop.getId()
                    + ", Model: " + laptop.getModel()
                    + ", Brand: " + laptop.getBrand()
                    + ", Price: " + laptop.getPrice());
        }

        // Update JList with new data
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String s : laptopStrings) {
            listModel.addElement(s);
        }
        contactList.setModel(listModel);
    }
});


    JButton buttonB = new JButton("Display PC parts");
    buttonB.setBounds(180, 130, 180, 30);
    buttonB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Fetch PC parts data from database and update the JList
            // ...
        }
    });
    productFrame.add(buttonB);

    JButton buttonC = new JButton("Display Tablets product");
    buttonC.setBounds(430, 90, 180, 30);
    buttonC.addActionListener(new ActionListenerImpl(listModel));
    productFrame.add(buttonC);

    JButton buttonD;
        buttonD = new JButton("Exit to main menu");
    buttonD.setBounds(430, 130, 180, 30);
    buttonD.addActionListener((ActionEvent e) -> {
        // Close the product frame and return to the main menu
        productFrame.dispose();
    });
    productFrame.add(buttonD);

    JButton exitButton = new JButton("Exit to main menu");
    exitButton.setBounds(300, 450, 180, 30);
    exitButton.addActionListener((ActionEvent e) -> {
        // Close the product frame and return to the main menu
        productFrame.dispose();
    });
    productFrame.add(exitButton);

    productFrame.setSize(800, 600);
    productFrame.setLocationRelativeTo(null);
    productFrame.setVisible(true);
}
 
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            ComputerStoreGUI computerStoreGUI = new ComputerStoreGUI();
        });
        
    }
    
    public void openLaptopProduct()
    { 
        JFrame LaptopFrame = new JFrame("Laptop page");
        LaptopFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LaptopFrame.setLayout(null);
        
        JLabel LaptopLabel = new JLabel("Laptop Page", SwingConstants.CENTER);
        LaptopLabel.setFont(new Font("Serif", Font.BOLD, 35));
        LaptopLabel.setBounds(140, 10, 500, 40);
        LaptopFrame.add(LaptopLabel);
        
        List<Laptop> laptops = Laptop.laptopz();

        
        for (int i = 0; i < laptops.size(); i++) 
        {
            Laptop laptop = laptops.get(i);

            JButton button = new JButton(laptop.getModel() + " by " + laptop.getBrand() + " - $" + laptop.getPrice());
            button.addActionListener((ActionEvent e) -> {
                System.out.println("Added " + laptop.getModel() + " to the shopping cart.");
            });
            
            LaptopFrame.add(button);
        }
               
        LaptopFrame.setSize(800, 600);
        LaptopFrame.setLocationRelativeTo(null);        
        LaptopFrame.setVisible(true);
        
         
    }

    private class ActionListenerImpl implements ActionListener {

        private final DefaultListModel<String> listModel;

        public ActionListenerImpl(DefaultListModel<String> listModel) {
            this.listModel = listModel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Fetch tablet data from database and update the JList
            List<Tablet> tablets = Tablets.tablet();
            
            // Clear the list model
            listModel.clear();
            
            // Convert tablet data to strings and add them to the list model
            for (Tablet tablet : tablets) {
                String tabletString = "ID: " + tablet.getId()
                        + ", Model: " + tablet.getModel()
                        + ", Brand: " + tablet.getBrand()
                        + ", Price: " + tablet.getPrice();
                listModel.addElement(tabletString);
            }
            
            // Update the JList with the new data
            contactList.setModel(listModel);
        }
    }
    
}
