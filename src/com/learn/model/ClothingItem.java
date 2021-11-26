package com.learn.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClothingItem {

    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String HAT = "Hat";

    private String type;
    private ClothingSize size;
    private double price;
    private int quantity;


}
