package com.amazon.tests.cart;

import com.amazon.base.BaseTest;
import com.amazon.pages._11_CartPage;
import com.amazon.pages._2_HomePage;
import com.amazon.pages._3_1_LoginPage;
import com.amazon.pages._4_ContinuePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_DeleteProductFromCart extends BaseTest {

    @Test
    public void testOpenCart() {

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

        // Step 5: Click Cart on the header
        _2_HomePage.openCartPage();

        // Step 6: Confirm Cart Page
        Assert.assertTrue(_11_CartPage.isCartVisible(),"Cart is not visible");

        // Step 7: Delete product from cart
        _11_CartPage.deleteProduct();

    }
}


