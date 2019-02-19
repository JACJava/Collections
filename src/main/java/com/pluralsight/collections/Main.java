package com.pluralsight.collections;

public class Main {

    public static void main(String[] args) {

 /*
        System.out.println();
        System.out.println("*** Collection Behaviors ***");
        System.out.println();

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        System.out.println(door.toString());
        System.out.println(floorPanel.toString());
        System.out.println(window.toString());

        Collection<Product> products;  //<> is restriction to say what type of every element is in the Collection

        //products = new ArrayList<Product>(); don't need the <Product>

        products = new ArrayList<>();

        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println();
        System.out.println(products);
        System.out.println();

        //let's use iterator

        final Iterator<Product> productIterator;

        productIterator = products.iterator();

        System.out.println();
        System.out.println("*** while loop ***");
        System.out.println();

//        while (productIterator.hasNext()) {
//            Product product = productIterator.next();
//            System.out.println(product);
//        }

        System.out.println();
        System.out.println("*** for each loop ***");
        System.out.println();
        for (Product product : products){
            System.out.println(product);
        }


        System.out.println();
        System.out.println("*** if stmt ***");
        System.out.println();

        while (productIterator.hasNext()) {

            Product product = productIterator.next();

            if (product.getWeight() > 20) {
                System.out.println(product);
            }
            else {
                productIterator.remove();
            }
        }

        System.out.println(products);

        System.out.println("size = " + products.size());
        System.out.println("empty? = " + products.isEmpty());

        System.out.println("contains window = " + products.contains(window));
        System.out.println("contains door = " + products.contains(door));

        Collection<Product> otherProducts = new ArrayList<>();

        otherProducts.add(window);
        otherProducts.add(door);

        products.removeAll(otherProducts);

        System.out.println(products);

*/
        System.out.println();
        System.out.println("*** Collections with Iteration Orders ***");
        System.out.println();

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        System.out.println(door.toString());
        System.out.println(floorPanel.toString());
        System.out.println(window.toString());

        Shipment shipment = new Shipment();

        shipment.add(door);
        shipment.add(floorPanel);

        System.out.println(shipment.toString());

    }
}
