package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollUsingJS {

     public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","force-device-scale-factor=0.75");
        
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        WebElement fname = driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

       // js.executeScript("window.scrollBy(0,1000)");

        js.executeScript("arguments[0].scrollIntoView()", fname);

     }
}
