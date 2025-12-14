package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.id("datepicker")).click();
        List<WebElement> allElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::td/a"));
        for (WebElement e : allElements) {
            if (e.getText().equals("25")) {
                e.click();
                break;
            }
        }

    }
}
