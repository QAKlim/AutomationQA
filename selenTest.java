package SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class selenTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //dragAndDropp
        driver.get("http://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement drog = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.moveToElement(drog).dragAndDrop(drog,drop).build().perform();
        System.out.println("dragAndDrop successful");


       driver.get("https://auto.ria.com/");
//        WebElement box = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Назад'])[1]/following::label[1]"));
//        box.click();
//        WebElement model = driver.findElement(By.linkText("Dodge"));
//        model.click();
//
//        WebElement select = driver.findElement(By.id("yearFrom"));
//        //List<WebElement> allOptions = select.findElements(By.tagName("option"));
//        Select select1 = new Select(select);
//        select1.selectByVisibleText("2018");
//
//        WebElement select2 = driver.findElement(By.id("yearTo"));
//        Select select3 = new Select(select2);
//        select3.selectByVisibleText("2018");
//
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Расширенный поиск'])[1]/following::span[1]")).click();






    }
}
