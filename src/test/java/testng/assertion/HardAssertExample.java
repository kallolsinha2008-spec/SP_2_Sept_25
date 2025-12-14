package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static testng.basicsoftestng.PreRequisiteAnnotation.driver;

public class HardAssertExample {

    //These are the changes for Git
    @Test
    public void verifyHardAssert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Assert.assertFalse(driver.findElement(By.id("user-name")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
        driver.close();

        /*Assert.assertTrue(true);
        System.out.println("Hello");
        Assert.assertFalse(true);   //Program terminates at this point. Rest of the statement is not executed
        System.out.println("Hi! There");
        Assert.assertTrue(true);
        System.out.println("How are ye?");*/
    }
}