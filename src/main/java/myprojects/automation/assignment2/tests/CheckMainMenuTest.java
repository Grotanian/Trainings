package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
       // TODO Script to check Main Menu items
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
        Thread.sleep(1500);

        String[] elem_ids = {"tab-AdminDashboard", "subtab-AdminParentOrders", "subtab-AdminCatalog",
                "subtab-AdminParentCustomer", "subtab-AdminParentCustomerThreads", "subtab-AdminStats",
                "subtab-AdminParentModulesSf", "subtab-AdminParentThemes", "subtab-AdminParentShipping",
                "subtab-AdminParentPayment", "subtab-AdminInternational", "subtab-ShopParameters",
                "subtab-AdminAdvancedParameters"};


        for (int i=0; i < elem_ids.length; i++)
        {
            WebElement tab_elem = driver.findElement(By.xpath(".//*[@id='"+elem_ids[i]+"']/a"));
            tab_elem.click();
            String page_title = driver.getTitle();
            System.out.println(page_title);
            driver.navigate().refresh();
            Thread.sleep(1500);
            String page_title_after_refresh = driver.getTitle();
            if (page_title == page_title_after_refresh)
            {
              System.out.println("The page title isn't changed after page refresh!");
            }

        }

        driver.close();

    }
}
