package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test
    public void verifySteam() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyReddit() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.reddit.com/");
        driver.close();
    }
}
