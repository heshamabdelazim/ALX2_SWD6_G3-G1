package com.amazon.tests.wishlist;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_2_OpenWishlist extends BaseTest {

    @Test
    public void testOpenWishlist() {

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

    }
}


