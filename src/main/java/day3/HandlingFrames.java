package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrames {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","force-device-scale-factor=0.75");
        
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("name")).sendKeys("Vibin");

        driver.switchTo().frame("frm1");
        Thread.sleep(5);
        WebElement allIde = driver.findElement(By.id("ide"));
        allIde.click();
        
        Select ideName = new Select(allIde);
        ideName.selectByIndex(1);
        ideName.selectByIndex(2);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("Gibin");

        driver.switchTo().frame("frm3");
        driver.findElement(By.id("name")).sendKeys("Frame3333");

    }
}
