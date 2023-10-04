package waitExample;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleFile{
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        WebElement fname= driver.findElement(By.name("email"));
        WebElement lname= driver.findElement(By.name("lname"));
        sendKeys(driver, fname, 10, "Your_Name");
        sendKeys(driver, lname, 20, "Your_Lastname");
        WebElement forgotAccount= driver.findElement(By.linkText("Forgotten account?"));
        clickOn(driver,forgotAccount, 10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    //sendkeys method
    public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value){
        WebElement until = new WebDriverWait(driver1, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    //clickable method declared explicitly
    public static void clickOn(WebDriver driver1, WebElement element, int timeout){
        new WebDriverWait(driver1,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(element));// Expectedcondition for the element to be clickable
        element.click();
    }
}