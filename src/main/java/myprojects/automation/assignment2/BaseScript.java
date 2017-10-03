package myprojects.automation.assignment2;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        //String browser = Properties.getBrowser();
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Common Files\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
    }
}
