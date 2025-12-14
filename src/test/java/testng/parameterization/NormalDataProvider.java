package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {

    @DataProvider(name = "test-Data")
    public Object[][] getData() {
        return new Object[][] {{"standard_user", "secret_sauce"},
                {"test", "secret_sauce"},
                {"standard_user", "test"},
                {"abc", "xyz"}};
    }

    @Test(dataProvider = "test-Data")
    public void verifyLoginWithNormalDataProvider(String username, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}
