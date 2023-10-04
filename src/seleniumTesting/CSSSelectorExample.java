package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector("input[id='login1']"));
        element.sendKeys("monali.khaire@gmail.com");

        element = driver.findElement(By.cssSelector("input#password"));
        element.sendKeys("123456");

        WebElement element1 = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        element1.click();

      //  WebElement element2 = driver.findElement(By.cssSelector(("input.signinbtn")));
      //  element2.click();

        Thread.sleep(2000);
        driver.close();
    }
}
