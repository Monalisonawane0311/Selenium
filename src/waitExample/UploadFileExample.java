package waitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadFileExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys("C:\\Users\\khair\\OneDrive\\Desktop\\monali.txt");
        driver.findElement(By.id("file-submit")).click();

       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("file-submit"))).click();
       Thread.sleep(3000);
        driver.close();
    }
}