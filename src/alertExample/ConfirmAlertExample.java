package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().window().maximize();

        //When we click on Ok button

        driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();

        WebElement element = driver.findElement(By.id("demo"));
        System.out.println(element.getText());

        //When we click on cancel button

        driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
        driver.switchTo().alert().dismiss();

        WebElement element1 = driver.findElement(By.id("demo"));
        System.out.println(element1.getText());


        Thread.sleep(5000);
        driver.close();
    }

}
