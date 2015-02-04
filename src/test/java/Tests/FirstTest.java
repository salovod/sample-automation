package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {

    static WebDriver driver;

    final static String baseURL = "https://www.google.com.ua/";

    public void beforeTest(String browser)
    {
        if (browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/home/rb/Documents/GIT/sample-automation/src/main/java/resources/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "D://Selenium/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            throw new IllegalArgumentException("The Browser Type is Undefined");
        }
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void close() {
            driver.quit();
    }

    @Parameters({"browser"})
    @Test
    public void first(String browser) {
        beforeTest(browser);

    }

    @Parameters({"browser"})
    @Test
    public void second(String browser) {
        beforeTest(browser);
        driver.get("http://www.softwaretestinghelp.com");
    }

    @Parameters({"browser"})
    @Test
    public void third(String browser) {
        beforeTest(browser);
    }
}
