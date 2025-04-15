package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends BasePage {

    private static By signinLink = By.id("nav-link-accountList-nav-line-1");
    public static By accountLink = By.id("nav-link-accountList");
    public static By searchField = By.id("twotabsearchtextbox");
    public static By searchButton = By.id("nav-search-submit-button");
    public static By accountPage = By.xpath("//span[normalize-space()='Account & Lists']");
    public static By cartLocator = By.xpath("//span[@id='nav-cart-count']");
    public static By languageButton = By.xpath("(//div[contains(text(),'EN')])[1]");
    public static By countryButton = By.xpath("(//span[@class='icp-color-base'][normalize-space()='Egypt'])[1]");
    public static By arabicCartTitle = By.xpath("(//span[contains(text(),'عربة التسوق')])[1]");

    public static boolean isAccountLinkVisible() {
        return driver.findElement(accountLink).isDisplayed();
    }

    public static boolean isArabicCartTitleVisible() {
        return driver.findElement(arabicCartTitle).isDisplayed();
    }

    public static LoginPage signinLink() {
        BasePage.click(signinLink);
        return new LoginPage();
    }

    public static void setSearch(String search) {
        set(searchField, search);
    }

    public static ProductsListingPage openProductsListing() {
        click(searchButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='a-dropdown-prompt'])[1]")));
        return new ProductsListingPage();

    }

    public static AccountPage openAccountPage() {
        click(accountPage);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[normalize-space()='Your Account']")));
        return new AccountPage();

    }

    public static CartPage openCartPage() {
        click(cartLocator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h2[normalize-space()='Shopping Cart'])[1]")));
        return new CartPage();

    }

    public static LanguagePage openLanguagePage() {
        click(languageButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[normalize-space()='Language Settings'])[1]")));
        return new LanguagePage();

    }

    public static CountryPage openCountryPage() {
        click(countryButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[normalize-space()='Website (Country/Region)'])[1]")));
        return new CountryPage();

    }
}