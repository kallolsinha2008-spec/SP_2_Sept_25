package testng.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExample {

    @Test
    public void t1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.close();
    }

    @Test
    public void t2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        driver.close();
    }

    @Test
    public void t3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.close();
    }

    @Test
    public void t4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();
    }

    @Test
    public void t5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://discord.com/");
        driver.close();
    }
}
