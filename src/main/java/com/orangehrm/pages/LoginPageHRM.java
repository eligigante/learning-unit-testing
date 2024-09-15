package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageHRM extends BasePageHRM{
    // define the fields/attributes of the page
    // private
    private By username = By.cssSelector("input[name='username']");
    private By password = By.name("password");
    private By loginButton = By.tagName("button");
    private By errorMessage = By.xpath("//p[text()='Invalid credentials']");

    public LoginPageHRM(WebDriver driver) {
        super(driver);
    }

    public void setUsername(String username){
        set(this.username, username);
    }

    public void setPassword(String password) {
        set(this.password, password);
    }

    public DashboardPageHRM clickLoginButton() {
        click(this.loginButton);
        return new DashboardPageHRM(driver);
    }

    public DashboardPageHRM logIntoTheApplication(String username, String password) {
        set(this.username, username);
        set(this.password, password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return findElement(errorMessage).getText();
    }
}
