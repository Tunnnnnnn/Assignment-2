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
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Object> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public ArrayList<Object> getItems() {
        return items;
    }
}
