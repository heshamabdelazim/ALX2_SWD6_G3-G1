package com.amazon.tests.wishlist;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_AddToWishlist extends BaseTest {

    @Test
    public void testAddToWishlist() {

        // Pre-requirement already created default shopping list
        // Pre-requirement product isn't in wishlist already

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

        // Step 10: Click Add to List
        _7_ProductDetailPage.openWishConfirmation();

        // Step 11: Confirm Add to List
        Assert.assertTrue(_8_WishlistConfirmation.isProductAdded(), "Product is not added to Wishlist");



    }
}


