package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleProgram {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input']"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement dropDownElement = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

        Thread.sleep(4000);

        Select select = new Select(dropDownElement);
        select.selectByValue("za");

        WebElement itemElement = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        //itemElement.click();
        itemElement = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        itemElement.click();
        Thread.sleep(4000);
        driver.close();
    }
}