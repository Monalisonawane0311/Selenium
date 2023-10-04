package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExample1
{
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//input[@id = 'login-username' or @name = 'user name']"));
        element.sendKeys("monali.khaire");

        element = driver.findElement(By.xpath("//input[@name ='username' and @class='phone-no ']"));
        element.sendKeys("987654321");

         element = driver.findElement((By.xpath("//span[starts-with(@class,'stay-signed')]")));
         element.click();

        WebElement startelement = driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]"));
        startelement.click();

        WebElement containsElement = driver.findElement(By.xpath("//input[contains(text(),login-signin)]"));
        containsElement.click();

        Thread.sleep(4000);
        driver.close();


    }
}
