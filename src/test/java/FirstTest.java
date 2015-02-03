import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://www.softwaretestinghelp.com/testng-framework-selenium-tutorial-12/");
    }

    @AfterClass
    public void setDown() {
        driver.close();
    }

    @Test(priority = 0)
    public void firstTest() {
    }
}
