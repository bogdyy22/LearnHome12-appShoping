package com.learn;

import com.learn.model.ClothingItem;
import com.learn.model.ClothingSize;
import com.learn.model.Hat;
import com.learn.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//
//        List<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Blue");
//        for (int i = 0; i < colors.size(); i++) {
//            System.out.println(colors.get(i));
//        }
//
//        List<ClothingItem> items = new ArrayList<>();
//        items.add(new Shirt(ClothingSize.M, 19.88, 45));
//        items.add(new Hat(ClothingSize.S, 200.44, 1));
//        for (ClothingItem item : items) {
//            displayItemDetails(item);
//        }

        Map<String, ClothingItem> items = new HashMap<>();
        items.put("Shirt", new Shirt(ClothingSize.M, 19.88, 45));
        items.put("Hat", new Hat(ClothingSize.S, 200.44, 1));

//        var anItem = items.get("Hat");
//        displayItemDetails(anItem);

        var keys = items.keySet();
        for (String key : keys) {
            var item = items.get(key);
            displayItemDetails(item);

        }
    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
