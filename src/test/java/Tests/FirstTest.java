package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Objects;

public class FirstTest {

    WebDriver driver;

    final static String baseURL = "http://www.softwaretestinghelp.com/testng-framework-selenium-tutorial-12/";


    @BeforeMethod
    public void open() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void close() {
            driver.quit();
    }

    @Test
    public void first() {

    }

    @Test
    public void second() {
        driver.get("http://www.softwaretestinghelp.com");
    }

    @Test
    public void third() {

    }
}
