package iframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeXpath {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/frames");
        driver.manage().window().maximize();

      //  driver.switchTo().frame(0);  by index

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id= 'frame1']")));

        WebElement iframeElement  = driver.findElement(By.xpath("//h1[text() = 'This is a sample page']"));
        System.out.println(iframeElement.getText());

        driver.close();
    }
}
