package SampleTest;

import com.thoughtworks.selenium.Selenium;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SamoleTest2 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://auto.ria.com/");

        WebDriver arg = new Augmenter().augment(driver);
        File scren = ((TakesScreenshot)arg).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scren, new File("D:\\screenshot.png"));
        //Test clone


    }
}
