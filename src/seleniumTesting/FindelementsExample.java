package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsExample {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement userNametextBox = (WebElement) driver.findElements(By.id("login1"));
        userNametextBox.sendKeys("monali.khaire@gmail.com");
        driver.close();
    }
}
