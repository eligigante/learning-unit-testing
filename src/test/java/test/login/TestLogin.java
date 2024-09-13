package test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;

    @BeforeClass // This will be executed before starting the class
    public void setUp() { // setting up the driver
        driver = new EdgeDriver(); // create an instance of the Edge Driver
        driver.manage().window().maximize(); // maximize the window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // going to the site
    }

    @AfterClass // It operates like a post condition after executing the class
    public void tearDown() {
        // driver.quit(); // closes every window and quits the driver
        // driver.close(); // only closes the standard window
    }

    @Test
    public void testLogin() throws InterruptedException {
        Thread.sleep(2000); // waits for 2 seconds

        // Username Field
        var username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Password Field
        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Clicking the button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000); // because it's a hard stop

        String result = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";
        Assert.assertEquals(result, expectedResult);

    }

}
