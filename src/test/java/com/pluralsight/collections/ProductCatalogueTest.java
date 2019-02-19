package com.pluralsight.collections;

import org.junit.Test;

import static com.pluralsight.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception{

        ProductCatalogue catalogue =  new ProductCatalogue();

        catalogue.isSuppliedby(bobs);
        catalogue.isSuppliedby(kates);

        assertThat(catalogue, containsInAnyOrder(door,floorPanel,window));

    }

    @Test
    public void shouldFindLightVanProducts() throws Exception{

        ProductCatalogue catalogue =  new ProductCatalogue();

        catalogue.isSuppliedby(bobs);
        catalogue.isSuppliedby(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));

    }

    @Test
    public void shouldFindHeavyVanProducts() throws Exception{

        ProductCatalogue catalogue =  new ProductCatalogue();

        catalogue.isSuppliedby(bobs);
        catalogue.isSuppliedby(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));

    }


}
