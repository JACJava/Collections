package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable
{
    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(final Product productToAdd)
    {
        final int uniqueId = productToAdd.getId();
        for (final Product product : products)
        {
            if (product.getId() == uniqueId)
            {
                throw new IllegalArgumentException(
                    "Unable to add product, duplicate id for: " + productToAdd);
            }
        }

        products.add(productToAdd);
    }

    @Override
    public Product lookupById(final int id)
    {
        for (final Product product : products)
        {
            if (product.getId() == id)
            {
                return product;
            }
        }

        return null;
    }

    public void clear()
    {
        products.clear();
    }
}
