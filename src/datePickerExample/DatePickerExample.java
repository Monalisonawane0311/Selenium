package datePickerExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement srcElement = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
        srcElement.sendKeys("pune");

        List <WebElement> allCities = driver.findElements(By.xpath("//ul[@class ='sc-dnqmqq eFEVtU']//child::li"));
        for(WebElement cityElement : allCities){
            if(cityElement.getText().equalsIgnoreCase("pune")) {
                cityElement.click();
                break;
            }
        }

        WebElement dtnElement = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
        dtnElement.sendKeys("mumbai");

        String month = "October 2023";
        String day = "16";

            // below line  click on date option
        driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
        //driver.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div/div/div[2]/input")).click();
       // Thread.sleep(5000);
        // give month and year
        while(true) {
            //String text = driver.findElement(By.xpath("//div[@class='container month ']")).getText();

            String text = driver.findElement(By.xpath("//span[text()='September']")).getText();
            System.out.println(text);
            //String text = driver.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div[2]/div[1]/div[2]/span[1]")).getText();
            // above line get the month and year
            if(text.equals(month)){
                break;
            }
            else{           // below line click next arrow
                driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
                //driver.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div[2]/div[1]/div[3]/span")).click();
            }
            //add for date
           driver.findElement(By.xpath("//span[text()='20']")).click();
            //*[@id="jaurney-date"]/div/div[2]/div[2]/span[23]
            //*[@id="jaurney-date"]/div/div[2]/div[2]/span[28]

            //span[text()='20']   date 20 xpath

            driver.findElement(By.id("search-button")).click();
        }
        Thread.sleep(5000);

        driver.close();

    }
}
