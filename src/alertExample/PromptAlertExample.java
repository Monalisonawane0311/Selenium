package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yes");
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();

        WebElement element = driver.findElement(By.id("demoone"));
        System.out.println(element.getText());

       driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
       Alert alert1=driver.switchTo().alert();
       alert1.dismiss();

       /*alert1.sendKeys("No");
        System.out.println(alert.getText());
       alert1.accept();*/
        WebElement element1 = driver.findElement(By.id("demoone"));
        System.out.println(element1.getText());


        Thread.sleep(5000);
        driver.close();
    }
}
