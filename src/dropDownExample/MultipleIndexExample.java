package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleIndexExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("multiselect1"));

        Select select = new Select(dropDownElement);
        select.selectByIndex(0);
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);


        //Deselect Value
        select.deselectByIndex(2);
        Thread.sleep(2000);
        select.deselectByIndex(0);
        Thread.sleep(2000);
        select.deselectByIndex(3);
        Thread.sleep(2000);
        select.deselectByIndex(1);

        Thread.sleep(4000);
        driver.close();
    }
}