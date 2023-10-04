package seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTesting {
    public static void main(String[] args) throws InterruptedException {
        /*ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\khair\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");*/
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);


        driver.close();


    }
}
