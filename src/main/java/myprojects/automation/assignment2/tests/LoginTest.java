package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseScript {

    public static void main(java.lang.String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Common Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // WebDriver driver = getDriver();
        driver.navigate().to(Properties.getBaseAdminUrl());
        //Thread.sleep(300);
        WebElement email_field = driver.findElement(By.id("email"));
        email_field.sendKeys("webinar.test@gmail.com");
        WebElement passwd_field = driver.findElement(By.id("passwd"));
        passwd_field.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement submit_btn = driver.findElement(By.name("submitLogin"));
        submit_btn.click();
        Thread.sleep(500);
        WebElement profile_elem = driver.findElement(By.cssSelector(".employee_avatar_small > img:nth-child(1)"));
        profile_elem.click();
        WebElement logout_btn = driver.findElement(By.id("header_logout"));
        logout_btn.click();
        driver.close();
    }
}
