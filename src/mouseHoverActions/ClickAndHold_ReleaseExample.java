package mouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_ReleaseExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        WebElement clickAndHoldElement = driver.findElement(By.xpath("//li[text() = 'H'] "));

        Actions actions = new Actions(driver);
        actions.clickAndHold(clickAndHoldElement)
                .perform();

        Thread.sleep(5000);

        actions.release().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
