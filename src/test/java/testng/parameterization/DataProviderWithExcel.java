package testng.parameterization;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "test-Data")
    public Object[][] getData() throws IOException {
        Object[][] arObj = getExcelData("C:\\TestNG.xlsx", "TestCase");
        return arObj;

    }

    public Object[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fp = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fp);
        Sheet sh = wb.getSheet(sheetName);
        int rows = sh.getPhysicalNumberOfRows();
        int cols = sh.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows-1][cols];

        for (int i = 1; i < rows; i++) {
            Row r = sh.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell c = r.getCell(j);
                data[i-1][j] = c.toString();
            }
        }
        return data;


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
