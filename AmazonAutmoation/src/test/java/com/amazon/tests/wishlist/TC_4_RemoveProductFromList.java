package com.amazon.tests.wishlist;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_4_RemoveProductFromList extends BaseTest {

    @Test
    public void testRemoveProductFromList() {

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

        // Step 5: Click account link
        HomePage.openAccountPage();

        // Step 6: Confirm account page
        Assert.assertTrue(AccountPage.isYourAccountVisible(), "Account page not visible");

        // Step 7 : Open wishlist
        AccountPage.openWishlistPage();

        // Step 8 : Confirm wishlist page
        Assert.assertTrue(WishlistPage.isWishlistPageVisible(), "Wishlist not visible");

        // Step 9 : Delete Product
        WishlistPage.deleteProduct();

        // Step 10 : Confirm Deletion
        Assert.assertTrue(WishlistPage.isProductDeleted(), "Product not deleted");

        test.info("Testing deleting product from wish list...");
        test.pass("product deleted from wish list successfully");
    }
}


