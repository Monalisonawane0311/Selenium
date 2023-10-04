package datePickerExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class RedbusExample {

    public static void main(String[] args) throws InterruptedException {

        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.redbus.in/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement srcElement = driver.findElement(By.id("src"));
        srcElement.sendKeys("pune");

        List<WebElement> allCities = driver.findElements(By.xpath("//ul[@class ='sc-dnqmqq eFEVtU']//child::li"));
        for(WebElement cityElement : allCities){
            if(cityElement.getText().equalsIgnoreCase("pune")) {
                cityElement.click();
                break;
            }
        }

        WebElement dtnElement = driver.findElement(By.id("dest"));
        dtnElement.sendKeys("mumbai");

        List<WebElement> allCities1 = driver.findElements(By.xpath("//ul[@class ='sc-dnqmqq eFEVtU']//child::li"));
        for(WebElement cityElement : allCities1){
            if(cityElement.getText().equalsIgnoreCase("mumbai")) {
                cityElement.click();
                break;
            }
        }
        //date picker
        driver.findElement(By.id("onwardCal")).click();
        // GET ALL dates
        List<WebElement> allDates = driver.findElements(By.xpath("//ul[@class ='sc-dnqmqq eFEVtU']//following::li"));
        for(WebElement e: allDates){
            if(e.getText().equalsIgnoreCase("21")){
                e.click();
            break;
            }
        }

        String month = " October 2023";
        String day = "16";

        // below line  click on date option
        driver.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div/div/div[2]/input")).click();
        Thread.sleep(5000);
        // give month and year
        while(true) {
            String text = driver.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div[2]/div[1]/div[2]/span[1]")).getText();
            // above line get the month and year
            if (text.equals(month)) {
                break;
            } else {           // below line click next arrow
                driver.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div[2]/div[1]/div[3]/span")).click();
            }
        }

        Thread.sleep(3000);
      driver.close();
    }
}