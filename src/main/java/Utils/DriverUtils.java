package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtils {
    public static WebDriver selectDriver(String browser, String version) throws Exception {
        WebDriver driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setVersion(version);

        switch (browser) {
            case "null":
                driver = new FirefoxDriver();
                return driver;
            case "firefox":
                driver = new FirefoxDriver();
                return driver;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
                driver = new ChromeDriver();
                return driver;
            case "ie":
                System.setProperty("webdriver.ie.driver", "/.exe");
                driver = new InternetExplorerDriver();
                return driver;
        }
        return driver;
    }
}
