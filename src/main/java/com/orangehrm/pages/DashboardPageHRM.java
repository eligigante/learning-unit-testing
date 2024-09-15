package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPageHRM extends BasePageHRM {
    private By header = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public DashboardPageHRM(WebDriver driver) {
        super(driver);
    }

    public boolean isProductsHeaderDisplayed() {
        return findElement(header).isDisplayed();
    }
}
