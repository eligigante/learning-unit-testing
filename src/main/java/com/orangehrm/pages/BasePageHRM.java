package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePageHRM {

    // field for WebDriver and WebDriverWait
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePageHRM(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Customize the timeout as needed
    }

    // method for setDriver
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    // method for finding elements
    protected WebElement findElement(By locator) {
        //return driver.findElement(locator);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // method for set Element with text
    protected void set(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    // method for clicking
    protected void click(By locator) {
        // findElement(locator).click();
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
}

