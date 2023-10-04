package dropDownExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetOptionsExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("drop1"));

        Select select = new Select(dropDownElement);
        List<WebElement> options = select.getOptions();
        for(WebElement element: options){
            System.out.println(element.getText());
        }



        Thread.sleep(4000);
        driver.close();
    }
}