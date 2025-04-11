package com.amazon.tests.plp;

import com.amazon.base.BaseTest;
import com.amazon.pages._2_HomePage;
import com.amazon.pages._6_ProductsListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTest extends BaseTest {

    @Test
    public void testPLP() {
        // Step 1: Set search product
        _2_HomePage.setSearch("iphone16 pro max");

        // Step 2: Click search
        _2_HomePage.openProductsListing();

        // Step 3: Confirm PLP
        Assert.assertTrue(_6_ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

    }
}


