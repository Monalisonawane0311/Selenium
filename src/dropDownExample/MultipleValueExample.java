package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("multiselect1"));

        Select select = new Select(dropDownElement);
        select.selectByValue("volvox");
        Thread.sleep(2000);
        select.selectByValue("Hyundaix");
        Thread.sleep(2000);
        select.selectByValue("swiftx");
        Thread.sleep(2000);
        select.selectByValue("audix");

        //Deselect Value
        select.deselectByValue("volvox");
        Thread.sleep(2000);
        select.deselectByValue("swiftx");
        Thread.sleep(2000);
        select.deselectByValue("Hyundaix");
        Thread.sleep(2000);
        select.deselectByValue("audix");



        Thread.sleep(4000);
        driver.close();
    }
}
