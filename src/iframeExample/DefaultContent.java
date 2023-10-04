package iframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DefaultContent {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //  driver.switchTo().frame(0);

        List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());

        driver.switchTo().frame("frame1");

        WebElement iframeElement = driver.findElement(By.xpath("//h1[text() = 'This is a sample page']"));
        System.out.println(iframeElement.getText());

        // default content
        //driver.switchTo().defaultContent();

        //parent frame
        driver.switchTo().parentFrame();
        WebElement element = driver.findElement(By.xpath("//div[text()='Frames']"));
        System.out.println(element.getText());
        driver.close();
    }
}