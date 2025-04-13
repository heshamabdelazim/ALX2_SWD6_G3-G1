package com.amazon.tests.wishlist;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_UndoRemoveProductFromList extends BaseTest {

    @Test
    public void testRemoveProductFromList() {

        // Step 1: Click Sign-in
        _2_HomePage.signinLink();

        // Step 2: Enter username/phone
        _3_1_LoginPage.setUsername("+201096933795");
        _3_1_LoginPage.signinButton();

        // Step 3: Enter password
        _4_ContinuePage.setPassword("aA1!testest00");
        _4_ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

        // Step 5: Click account link
        _2_HomePage.openAccountPage();

        // Step 6: Confirm account page
        Assert.assertTrue(_5_AccountPage.isYourAccountVisible(), "Account page not visible");

        // Step 7 : Open wishlist
        _5_AccountPage.openWishlistPage();

        // Step 8 : Confirm wishlist page
        Assert.assertTrue(_9_WishlistPage.isWishlistPageVisible(), "Wishlist not visible");

        // Step 9 : Delete Product
        _9_WishlistPage.deleteProduct();

        // Step 10 : Confirm Deletion
        Assert.assertTrue(_9_WishlistPage.isProductDeleted(), "Product not deleted");

        // Step 11 : Undo Delete Product
        _9_WishlistPage.undoDeleteProduct();

        // Step 12 : Confirm Undo Delete Product
        Assert.assertTrue(_9_WishlistPage.isProductInList(),"Product wasn't re-added");
    }
}


