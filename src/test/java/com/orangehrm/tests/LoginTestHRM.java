package com.orangehrm.tests;

import com.orangehrm.pages.BasePageHRM;
import com.orangehrm.pages.DashboardPageHRM;
import com.orangehrm.pages.LoginPageHRM;
import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestHRM extends BaseTestHRM {

    protected BasePageHRM basePageHRM;
    protected LoginPageHRM loginPageHRM;
    protected DashboardPageHRM dashboardPageHRM;

    @Test // testing if user credentials are correct
    public void testLoginCredentialsCorrect() throws InterruptedException {
        basePageHRM = new BasePageHRM(driver);
        loginPageHRM = new LoginPageHRM(driver);
        dashboardPageHRM = loginPageHRM.logIntoTheApplication("Admin", "admin123");
        Assert.assertTrue(dashboardPageHRM.isProductsHeaderDisplayed());

    }

    @Test // testing if user credentials are incorrect
    public void testLoginCredentialsIncorrect() {
        basePageHRM = new BasePageHRM(driver);
        loginPageHRM = new LoginPageHRM(driver);
        loginPageHRM.logIntoTheApplication("Admin", "admin");
        String result = loginPageHRM.getErrorMessage();
        Assert.assertEquals(result, "Invalid credentials");
    }
}
