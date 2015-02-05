package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {

    static WebDriver driver;

    final static String baseURL = "https://www.google.com.ua/";

    public void beforeTest(String browser, String version) throws Exception {
        Parse parse = new Parse();
        DesiredCapabilities caps = new DesiredCapabilities();
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            caps.setCapability("browser_version", version);
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/home/rb/Documents/GIT/sample-automation/src/main/java/resources/chromedriver");
            driver = new ChromeDriver();
            caps.setCapability("browser_version", version);
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "D://Selenium/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            caps.setCapability("browser_version", version);
        } else {
            throw new IllegalArgumentException("The Browser Type is Undefined");
        }
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

    @Parameters({"browser", "version"})
    @Test
    public void first(String browser, String version, ITestContext itc) throws Exception {
        beforeTest(browser, version);
//        driver.findElement(By.className("gbqfif")).sendKeys(a);
        Thread.sleep(10000);
    }

    @Parameters({"browser", "version"})
    @Test
    public void second(String browser, String version) throws Exception {
        beforeTest(browser, version);
        driver.get("http://www.softwaretestinghelp.com");
    }

    @Parameters({"browser", "version"})
    @Test
    public void third(String browser, String version) throws Exception {
        beforeTest(browser, version);
    }
}
