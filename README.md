# Amazon Website Automation Project

This project is an automated testing suite for core functionalities of the Amazon website using **TestNG**, **Selenium WebDriver**, and Java. The test cases cover key user journeys including registration, login, wishlist management, cart operations, and basic UI interactions like changing language or store.

---

# 📁 Project Structure

```plaintext
AmazonAutomation/
│
├── src/
│   ├── main/
│   │   └── java/com.amazon.pages/
│   │       ├── AccountPage.java
│   │       ├── AddToCartPage.java
│   │       ├── BasePage.java
│   │       ├── CartPage.java
│   │       ├── Checkout.java
│   │       ├── ContinuePage.java
│   │       ├── CountryPage.java
│   │       ├── HomePage.java
│   │       ├── LanguagePage.java
│   │       ├── LoginPage.java
│   │       ├── Main.java
│   │       ├── ProductDetailPage.java
│   │       ├── ProductsListingPage.java
│   │       ├── RegisterPage.java
│   │       ├── RegisterPageContinue.java
│   │       ├── WishlistConfirmation.java
│   │       └── WishlistPage.java
│   │
│   └── resources/
│
├── test/
│   └── java/com.amazon/
│       ├── base/
│       │   └── BaseTest.java
│       ├── data/
│       │   └── DataBase.java
│       └── tests/
│           ├── cart/
│           │   ├── TC_1_AddToCart.java
│           │   ├── TC_2_OpenCart.java
│           │   └── TC_3_DeleteProductFromCart.java
│           ├── footer/
│           │   └── TC_1_ChangeStore.java
│           ├── header/
│           │   └── TC_1_ChangeLanguage.java
│           ├── login/
│           │   └── TC_1_Login.java
│           ├── Register/
│           │   └── TC_1_Register.java
│           └── wishlist/
│               ├── TC_1_AddToWishlist.java
│               ├── TC_2_OpenWishlist.java
│               ├── TC_3_UndoRemoveProductFromList.java
│               └── TC_4_RemoveProductFromList.java
```
# ✅ TestNG Suite Configuration
The tests are grouped and managed through the testng.xml file as shown below:

<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Amazon Test Suite" parallel="none">

```xml
    <test name="Register and Logging Scenarios">
        <classes>
            <class name="com.amazon.tests.register.TC_1_Register"/>
            <class name="com.amazon.tests.login.TC_1_Login"/>
        </classes>
    </test>

    <test name="Wishlist Scenarios">
        <classes>
            <class name="com.amazon.tests.wishlist.TC_1_AddToWishlist"/>
            <class name="com.amazon.tests.wishlist.TC_2_OpenWishlist"/>
            <class name="com.amazon.tests.wishlist.TC_3_UndoRemoveProductFromList"/>
            <class name="com.amazon.tests.wishlist.TC_4_RemoveProductFromList"/>
        </classes>
    </test>

    <test name="Cart Scenarios">
        <classes>
            <class name="com.amazon.tests.cart.TC_1_AddToCart"/>
            <class name="com.amazon.tests.cart.TC_2_OpenCart"/>
            <class name="com.amazon.tests.cart.TC_3_DeleteProductFromCart"/>
        </classes>
    </test>

    <test name="Header and Footer Scenarios">
        <classes>
            <class name="com.amazon.tests.header.TC_1_ChangeLanguage"/>
            <class name="com.amazon.tests.footer.TC_1_ChangeStore"/>
        </classes>
    </test>

</suite>
```
# 🔍 Test Scenarios Covered
## 🧾 Register & Login
TC_1_Register: Verify successful user registration flow.

TC_1_Login: Test user login with valid credentials.

## 💖 Wishlist
TC_1_AddToWishlist: Add a product to the wishlist.

TC_2_OpenWishlist: Open and validate wishlist contents.

TC_3_UndoRemoveProductFromList: Undo product removal from wishlist.

TC_4_RemoveProductFromList: Remove a product from the wishlist.

## 🛒 Cart
TC_1_AddToCart: Add a product to the shopping cart.

TC_2_OpenCart: Open and verify cart items.

TC_3_DeleteProductFromCart: Remove a product from the cart.

## 🌐 UI - Header/Footer
TC_1_ChangeLanguage: Switch between available site languages.

TC_1_ChangeStore: Change the store location via footer settings.

# 🚀 How to Run the Tests
## Prerequisites
- Java JDK 8 or higher

- Maven

- TestNG

- Selenium WebDriver

- A suitable browser driver (e.g., ChromeDriver)

## Running via Command Line
```bash
mvn clean test
```
Or run a specific test suite:
```bash
mvn test -DsuiteXmlFile=testng.xml
```
# 🛠 Tools & Technologies Used
- Java

- Selenium WebDriver

- TestNG

- Maven

- Page Object Model (POM)

# 📄 Reporting
Test results can be viewed in the default TestNG report generated under:
```plaintext
/test-output/index.html
```

# 📌 Notes
- Ensure the correct browser driver path is set up in your system (e.g., chromedriver.exe).

- Base URLs and credentials should be configured using an external .properties or .xml config file.

- Consider adding @BeforeClass, @BeforeMethod, and @AfterMethod for reusable setup/teardown.

# 📬 Contact
For any queries or contributions, feel free to reach out.



