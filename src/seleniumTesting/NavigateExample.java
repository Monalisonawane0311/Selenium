package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://login.yahoo.com/");
        driver.manage().window().maximize();

        WebElement navigateElement = driver.findElement(By.linkText("Forgot username?"));
                navigateElement.click();
                Thread.sleep(4000);
                driver.navigate().back();
                Thread.sleep(4000);
                driver.navigate().forward();
                Thread.sleep(4000);
                driver.navigate().refresh();

                Thread.sleep(4000);
        driver.close();
    }
}
