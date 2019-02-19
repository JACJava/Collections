package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities
{
    public static void main(String[] args)
    {
        Product door = ProductFixtures.door;
        Product floorPanel = ProductFixtures.floorPanel;
        Product window = ProductFixtures.window;

        List<Product> products = new ArrayList<>();
        Collections.addAll(products, door, floorPanel, window);

        System.out.println("Here I am " + products);

        final Product product = Collections.max(products, Product.BY_WEIGHT);
        System.out.println(product);
    }
}
