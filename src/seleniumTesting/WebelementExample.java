package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();


        WebElement enabledElement = driver.findElement(By.id("enabled-button"));
        WebElement disabledElement = driver.findElement(By.xpath("//input[@id = 'disabled-button']"));
        WebElement textBoxElement = driver.findElement(By.cssSelector("input[id = 'enabled-example-input']"));

        System.out.println(textBoxElement.isEnabled());
        disabledElement.click();
        System.out.println(textBoxElement.isEnabled());
        enabledElement.click();
        System.out.println(textBoxElement.isEnabled());

        /*WebElement element = driver.findElement(By.xpath("//label[contains(text(),bmw)]"));
        element.click();

         element = driver.findElement(By.xpath("//input[@id= 'autosuggest']"));
        element.sendKeys("absdjgfjdf");
        Thread.sleep(4000);
        element.clear();

        element= driver.findElement(By.xpath("//a[@id= 'opentab']"));
        System.out.println(element.getText());

        element = driver.findElement(By.xpath("//button[@id= 'openwindow']"));
        System.out.println(element.getTagName());*/

        Thread.sleep(1000);
        driver.close();
    }
}
