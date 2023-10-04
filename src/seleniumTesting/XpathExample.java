package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//input[@id ='login1']"));
        element.sendKeys("monali.kahire@gmail.com");

        Thread.sleep(1000);

        //element = driver.findElement(By.xpath("//input[@id ='password']"));
        element = driver.findElement(By.xpath("//input[@name = 'passwd']"));
        element.sendKeys("12345");
        Thread.sleep(1000);

        //element = driver.findElement(By.xpath("//label[@class = 'lblkeepme']"));
       // element.click();
        element = driver.findElement(By.xpath("//input[@name = 'remember']"));
        element.click();

        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//u[text() = 'Forgot Password?']"));
        element.click();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//input[@class = 'signinbtn']"));
        element.click();

        Thread.sleep(2000);
        driver.close();

    }
}
