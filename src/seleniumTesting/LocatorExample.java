package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        /*WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("monali.khaire@gmail.com");*/
        /*WebElement element = driver.findElement(By.className("signinbtn"));
        element.click();*/

        WebElement element = driver.findElement(By.name("login"));
        element.click();
        Thread.sleep(1000);
        element = driver.findElement(By.name("passwd"));
        element.click();
        Thread.sleep(1000);
        element = driver.findElement(By.name("remember"));
        element.click();

       /* element = driver.findElement(By.linkText("Forgot Password?"));

        element.click();*/
       /* element = driver.findElement(By.linkText("Create a new account"));
        element.click();*/

        element = driver.findElement(By.partialLinkText("Create a new "));
        element.click();

        List<WebElement> elements1 = driver.findElements(By.tagName("input"));
        System.out.println(elements1.size());
        Thread.sleep(2000);
        driver.close();
    }
}
