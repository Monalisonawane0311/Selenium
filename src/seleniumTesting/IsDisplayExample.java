package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//button[@id='but2']"));
        System.out.println(element.isDisplayed());          //true

        element = driver.findElement(By.id("but1"));
        System.out.println(element.isDisplayed());          //true display the button
        System.out.println(element.isEnabled());            // false hide the button

        element = driver.findElement(By.name("vehicle"));
        System.out.println(element.isSelected());           // false before click the radio button
        element.click();
        System.out.println(element.isSelected());           // true after click the radio button

        System.out.println();
        WebElement element1 = driver.findElement(By.xpath("//input[@name = 'accessories'][1]"));
        element1.click();
        System.out.println(element1.isSelected());

        element1 = driver.findElement(By.xpath("//input[@name = 'accessories'][2]"));
        System.out.println(element1.isSelected());

        element1 = driver.findElement(By.xpath("//input[@name = 'accessories'][3]"));
        element1.click();
        System.out.println(element1.isSelected());

        element1 = driver.findElement(By.xpath("//input[@name = 'accessories'][4]"));
        element1.click();
        System.out.println(element1.isSelected());

        Thread.sleep(4000);
        driver.close();
    }
}
