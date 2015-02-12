package Runner;

import Utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    final static String baseURL = "https://www.google.com.ua/";
    WebDriver driver;

    @BeforeMethod
    public void start(ITestContext context) throws Exception {
        driver = DriverUtils.selectDriver(
                context.getCurrentXmlTest().getParameter("browser"),
                context.getCurrentXmlTest().getParameter("brversion")
        );
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

    @Test
    public void first() throws InterruptedException {
        driver.findElement(By.className("gbqfif")).sendKeys("qwee");
    }

    @Test
    public void second() throws InterruptedException {
        driver.get("http://www.softwaretestinghelp.com");
    }

    @Test
    public void third() throws InterruptedException {
    }
}
