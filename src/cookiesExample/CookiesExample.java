package cookiesExample;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class CookiesExample {
    public static void main(String[] args) {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.capgemini.com/in-en/");
        driver.manage().window().maximize();

        Cookie addOwnCookie = new Cookie("Name", "Monali");

        driver.manage().addCookie(addOwnCookie);

        Set<Cookie> allCookies = driver.manage().getCookies(); // get all cookies

        for(Cookie c: allCookies) {
            System.out.println(c);
        }

        Cookie cookieName = driver.manage().getCookieNamed("Name");
        System.out.println(cookieName);

        driver.manage().deleteCookieNamed("Name");
        System.out.println("After Delete the Own Cookie");

        //driver.manage().deleteAllCookies();
        Set<Cookie> allCookies1 = driver.manage().getCookies(); // get all cookies
        for(Cookie c: allCookies1) {
            System.out.println(c);
        }
        driver.close();
    }
}
