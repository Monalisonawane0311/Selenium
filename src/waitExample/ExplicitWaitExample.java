package waitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement radioButton =driver.findElement(By.id("bmwradio"));

        WebDriverWait webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(radioButton)).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign In']"))).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot Password?"))).click();
       driver.close();
    }
}