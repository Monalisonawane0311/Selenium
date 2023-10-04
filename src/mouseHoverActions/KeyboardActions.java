package mouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.id("ta1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(textBox)
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("this is monali")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();

        Thread.sleep(5000);
        driver.close();
    }
}
