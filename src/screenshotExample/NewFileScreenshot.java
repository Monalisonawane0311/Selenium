package screenshotExample;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NewFileScreenshot {
    public static void main(String[] args) {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dstn = new File("\"C:\\Users\\khair\\OneDrive\\Pictures\\Google_" +timeStamp()+".png");
       // FileUtils.copyFile(source,dstn);

        driver.close();

    }

    public static String timeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd-mm-ss").format(new Date());
    }

}
