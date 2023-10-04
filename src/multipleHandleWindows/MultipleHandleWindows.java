package multipleHandleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleHandleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();

        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);

        Set<String> childWindowsId = driver.getWindowHandles();
        System.out.println("Get All Child Windows");
        System.out.println(childWindowsId);

        for (String s:childWindowsId ) {
            if(!parentWindowId.contentEquals(s)){
                driver.switchTo().window(s);                //switchTo from parent to child window
                driver.manage().window().maximize();
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                driver.close();
            }
        }
// again switchTo child to parent window and closing the parent window
        driver.switchTo().window(parentWindowId);
        Thread.sleep(2000);
        driver.close();
    }
}