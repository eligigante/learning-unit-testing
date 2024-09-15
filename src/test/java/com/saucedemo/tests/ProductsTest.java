package com.saucedemo.tests;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        ProductsPage productsPage = loginPage.loginIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
    }
}
