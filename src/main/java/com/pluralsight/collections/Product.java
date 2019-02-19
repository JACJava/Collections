package com.pluralsight.collections;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product
{
    public static final Comparator<Product> BY_WEIGHT
            = comparing(Product::getWeight);

    public static final Comparator<Product> BY_NAME
            = comparing(Product::getName);

    private final String name;
    private final int weight;

    public Product(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, weight);
    }
}
