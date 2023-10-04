package seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsSeleniumExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);

        //String pageSourceData = driver.getPageSource();
        //System.out.println(pageSourceData);

        driver.manage().window().fullscreen();
        Thread.sleep(3000);
       // driver.manage().window().minimize();
        //Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.close();

    }
}
