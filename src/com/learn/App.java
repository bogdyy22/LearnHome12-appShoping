package com.learn;

import com.learn.model.ClothingItem;
import com.learn.model.ClothingSize;

import java.text.NumberFormat;


public class App {
    public static void main(String[] args) {

        var item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.M, 19.99, 898);
//        item.setType("Shirt");
//        item.setSize("M");
//        item.setPrice(19.99);
//        item.setQuantity(10000);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);

    }
}
