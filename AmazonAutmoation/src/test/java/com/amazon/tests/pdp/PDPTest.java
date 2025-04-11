package com.amazon.tests.pdp;

import com.amazon.base.BaseTest;
import com.amazon.pages._2_HomePage;
import com.amazon.pages._6_ProductsListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDPTest extends BaseTest {
    @Test
    public void testPDP() {

        // Step 1: Set search product
        _2_HomePage.setSearch("iphone16 pro max");

        // Step 2: Click search
        _2_HomePage.openProductsListing();

        // Step 3: Confirm PLP
        Assert.assertTrue(_6_ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

        // Step 4: Click Product
        _6_ProductsListingPage.productDetails();

        // Step 5: Confirm PDP

    }
}
