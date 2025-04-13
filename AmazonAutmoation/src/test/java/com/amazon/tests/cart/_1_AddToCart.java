package com.amazon.tests.cart;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_AddToCart extends BaseTest {

    @Test
    public void testAddToCart() {

        // Step 1: Click Sign-in
        _2_HomePage.signinLink();

        // Step 2: Enter username/phone
        _3_LoginPage.setUsername("+201096933795");
        _3_LoginPage.signinButton();

        // Step 3: Enter password
        _4_ContinuePage.setPassword("aA1!testest00");
        _4_ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

        // Step 5: Set search product
        _2_HomePage.setSearch("Men Classic Shirt from White Eagle");

        // Step 6: Click search
        _2_HomePage.openProductsListing();

        // Step 7: Confirm PLP
        Assert.assertTrue(_6_ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

        // Step 8: Click Product
        _6_ProductsListingPage.productDetails();

        // Step 9: Confirm PDP
        Assert.assertTrue(_7_ProductDetailPage.isPDPVisible(),"PDP is not visible");

        // Step 10: Click Add to Cart
        _7_ProductDetailPage.openAddToCartPage();

        // Step 11: Confirm item added to cart
        Assert.assertTrue(_10_AddToCartPage.isAddtoCartVisible(), "Product is not added to Cart");

        // Step 12: Click go to Basket
        _10_AddToCartPage.openCartPage();

        // Step 13: Confirm cart page
        Assert.assertTrue(_11_CartPage.isCartVisible(), "Cart is not visible");
    }
}


