package com.amazon.tests.footer;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_ChangeStore extends BaseTest {

    @Test
    public void testChangeStore() {

        // Step 1: Click Country Link
        _2_HomePage.openCountryPage();
        wait(2);

        // Confirm Country Page
        Assert.assertTrue(_14_CountryPage.isCountryPageVisible(), "Country page is not visible");

        // Step 2: Click Country Dropdown Button
        _14_CountryPage.clickCountryButton();
        wait(2);

        // Step 3: Choose Canada Country
        _14_CountryPage.clickCanadaCountry();
        wait(2);

        // Step 4: Confirm Submit Button
        _14_CountryPage.clickSubmitButton();
        wait(2);

    }
}


