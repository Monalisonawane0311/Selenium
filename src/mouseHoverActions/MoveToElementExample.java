package mouseHoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MoveToElementExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement cursorMoving = driver.findElement(By.id("blogsmenu"));

        Actions actions = new Actions(driver);
        actions.moveToElement(cursorMoving)
                .perform();
        Thread.sleep(5000);
        Select select = new Select(cursorMoving);
 
        List<WebElement> allOption = select.getOptions();
        for (WebElement getAllOption:allOption) {
            System.out.println(getAllOption.getText());

        }

        Thread.sleep(5000);
        driver.close();
    }

}



/* driver.navigate().to("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
        driver.manage().window().maximize();

        WebElement cursorMoving = driver.findElement(By.xpath("//span[text()='Women']"));


        Actions actions = new Actions(driver);
        actions.moveToElement(cursorMoving)
                .perform();*/