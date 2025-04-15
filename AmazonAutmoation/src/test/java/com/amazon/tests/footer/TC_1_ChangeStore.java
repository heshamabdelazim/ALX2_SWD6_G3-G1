package com.amazon.tests.footer;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_1_ChangeStore extends BaseTest {

    @Test
    public void testChangeStore() {

        // Step 1: Click Country Link
        HomePage.openCountryPage();
        wait(2);

        // Confirm Country Page
        Assert.assertTrue(CountryPage.isCountryPageVisible(), "Country page is not visible");

        // Step 2: Click Country Dropdown Button
        CountryPage.clickCountryButton();
        wait(2);

        // Step 3: Choose Canada Country
        CountryPage.clickCanadaCountry();
        wait(2);

        // Step 4: Confirm Submit Button
        CountryPage.clickSubmitButton();
        wait(2);

    }
}


