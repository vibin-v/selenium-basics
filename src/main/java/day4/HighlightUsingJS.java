package day4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HighlightUsingJS {
    
    public static void main(String[] args) throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","force-device-scale-factor=0.75");
        
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        WebElement fname = driver.findElement(By.id("firstName"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].style.border='2px solid red'",fname);
        js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", fname);
        Thread.sleep(5000);
        js.executeScript("arguments[0].setAttribute('style', 'border:2px ; background:')", fname);
    }

}
