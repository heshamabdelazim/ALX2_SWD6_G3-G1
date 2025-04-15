package com.amazon.tests.cart;

import com.amazon.base.BaseTest;
import com.amazon.pages.CartPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.ContinuePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3_DeleteProductFromCart extends BaseTest {

    @Test
    public void testDeleteProduct() {

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

        // Step 5: Click Cart on the header
        HomePage.openCartPage();

        // Step 6: Confirm Cart Page
        Assert.assertTrue(CartPage.isCartVisible(),"Cart is not visible");

        // Step 7: Delete product from cart
        CartPage.deleteProduct();

        test.info("Testing deleting product from cart...");
        test.pass("Product deleted successfully from cart");

    }
}


