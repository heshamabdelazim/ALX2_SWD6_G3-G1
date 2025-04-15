package com.amazon.tests.cart;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_1_AddToCart extends BaseTest {

    @Test
    public void testAddToCart() {

        // Step 1: Click Sign-in
        HomePage.signinLink();

        // Step 2: Enter username/phone
        LoginPage.setUsername("+201096933795");
        LoginPage.signinButton();

        // Step 3: Enter password
        ContinuePage.setPassword("aA1!testest00");
        ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

        // Step 5: Set search product
        HomePage.setSearch("Men Classic Shirt from White Eagle");

        // Step 6: Click search
        HomePage.openProductsListing();

        // Step 7: Confirm PLP
        Assert.assertTrue(ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

        // Step 8: Click Product
        ProductsListingPage.productDetails();

        // Step 9: Confirm PDP
        Assert.assertTrue(ProductDetailPage.isPDPVisible(),"PDP is not visible");

        // Step 10: Click Add to Cart
        ProductDetailPage.openAddToCartPage();

        // Step 11: Confirm item added to cart
        Assert.assertTrue(AddToCartPage.isAddtoCartVisible(), "Product is not added to Cart");

        // Step 12: Click go to Basket
        AddToCartPage.openCartPage();

        // Step 13: Confirm cart page
        Assert.assertTrue(CartPage.isCartVisible(), "Cart is not visible");
    }
}


