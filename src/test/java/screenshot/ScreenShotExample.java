package screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShotExample {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");

        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f, new File("C:\\Users\\Rakesh\\OneDrive\\Pictures\\Screenshots\\Screenshot (2).png"));

        driver.close();


    }
}
