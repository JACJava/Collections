package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    public static final int PRODUCT_NOT_PRESENT = -1;
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product> products = new ArrayList<>();

    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;


    public void add(Product product){

        products.add(product);

    }


    public void replace(Product oldProduct, Product newProduct) {

        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT) { //product IS present
            products.set(index, newProduct);
        }
    }

    public void prepare() {

        // sort our list of products by weight

        //Collections.sort(products, Product.BY_WEIGHT); //java 7

        products.sort(Product.BY_WEIGHT); //java 8

        // then, find the product index that needs the heavy van

        int splitPoint = findSplitPoint();

        // then, assign views of the product list for heavy and light vans

        lightVanProducts = products.subList(0,splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());

    }

    private int findSplitPoint() {

        for (int i = 0; i < products.size(); i++){

            final Product product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT){
                return i;
            }

        }

        return 0;

    }

    public List<Product> getHeavyVanProducts() {return heavyVanProducts;}
    public List<Product> getLightVanProducts() {return lightVanProducts;}

    public Iterator<Product> iterator() {return products.iterator();}

    //constructor
    public Shipment(){
        //this.name = name;
        //this.weight = weight;
    }




    //getter
    //public String getName() {return name;}
    //public int getWeight() {return weight;}





}
