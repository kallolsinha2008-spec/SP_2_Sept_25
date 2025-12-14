package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreRequisiteAnnotation {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void verifySteam() {
        driver.get("https://store.steampowered.com/");
    }

    @Test
    public void verifyReddit() {
        driver.get("https://www.reddit.com/");
    }
}
