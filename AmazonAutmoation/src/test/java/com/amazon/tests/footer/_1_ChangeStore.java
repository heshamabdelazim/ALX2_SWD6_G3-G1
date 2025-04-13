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

        // Step 2: Click Country Dropdown Button
        _14_CountryPage.clickCountryButton();

        // Step 3: Choose Canada Country
        _14_CountryPage.clickCanadaCountry();

        // Step 4: Confirm Submit Button
        _14_CountryPage.clickSubmitButton();

    }
}


