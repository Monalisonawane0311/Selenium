package javaScriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEByWebElement {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

       WebElement element = driver.findElement(By.xpath("//a[text()='Blogger']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);

        Thread.sleep(5000);
        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");


      /*  JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");            // scroll down the window
        Thread.sleep(3000);
        javascriptExecutor.executeScript("window.scrollBy(0,-2000)");           // scroll up window
*/

        Thread.sleep(3000);
        driver.close();

    }
}
