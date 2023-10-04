package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleVisibleTextExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("multiselect1"));

        Select select = new Select(dropDownElement);
        select.selectByVisibleText("Volvo");
        Thread.sleep(2000);
        select.selectByVisibleText("Swift");
        Thread.sleep(2000);
        select.selectByVisibleText("Hyundai");
        Thread.sleep(2000);
        select.selectByVisibleText("Audi");

        //Deselect Value
        select.deselectByVisibleText("Swift");
        Thread.sleep(2000);
        select.deselectByVisibleText("Audi");
        Thread.sleep(2000);
        select.deselectByVisibleText("Hyundai");
        Thread.sleep(2000);
        select.deselectByVisibleText("Volvo");



        Thread.sleep(4000);
        driver.close();
}
}
