package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtils {

    public static WebDriver selectDriver(String browser, String version) throws Exception {
        WebDriver driver;
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
            driver = new FirefoxDriver();
        }
        return  driver;
    }
}
