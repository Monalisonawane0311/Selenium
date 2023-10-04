package datePickerExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AbhiBusExample {
    public static void main(String[] args) {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/bus-ticket-booking");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement sourceElement = driver.findElement(By.id("source"));
        sourceElement.sendKeys("pune");

        List<WebElement> allSourceCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
        for (WebElement element : allSourceCities) {
            if (element.getText().equalsIgnoreCase("pune")) {
                element.click();
                break;
            }
        }

        WebElement destinationElement = driver.findElement(By.id("destination"));
        destinationElement.sendKeys("mumbai");

        List<WebElement> allDestinationCities = driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        for (WebElement element : allDestinationCities) {
            if (element.getText().equalsIgnoreCase("mumbai")) {
                element.click();
                break;
            }
        }
        // below line  click on date option
        driver.findElement(By.id("datepicker1")).click();
        //add for date
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::td"));
            for (WebElement e : allDates) {
                if (e.getText().equalsIgnoreCase("21")) {
                    e.click();
                    break;
                }
            }




        String month = "October 2023";
        String day = "16";

        // Thread.sleep(5000);

      // give month and year
       while (true) {
            //String text = driver.findElement(By.xpath("//div[@class='container month ']")).getText();

            String text = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            System.out.println(text);

            // above line get the month and year
            if (text.equals(month)) {
                break;
            } else {           // below line click next arrow
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

            }


          //  driver.findElement(By.xpath(("//button[@class='searchbtn']"))).click();
            //WebElement searchButton = driver.findElement(By.id("seo_search_btn"));
            //searchButton.click();

//        Thread.sleep(3000);
            driver.close();
        }
    }
}