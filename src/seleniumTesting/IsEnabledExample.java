package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.gmail.com");

        WebElement element1 = driver.findElement(By.xpath("//input[@name = 'identifier']"));
        element1.sendKeys("monali.khaire@gmail.com");
        System.out.println(element1.isDisplayed());

        WebElement element = driver.findElement(By.xpath("//button[@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
        element.click();
        System.out.println(element.isEnabled());


        Thread.sleep(4000);
        driver.close();
    }
}
