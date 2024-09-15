package com.orangehrm.tests;

import com.orangehrm.pages.BasePageHRM;
import com.orangehrm.pages.LoginPageHRM;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestHRM {
    protected WebDriver driver;
//    protected BasePageHRM basePageHRM;
//    protected LoginPageHRM loginPageHRM;
    private String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(this.url);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
