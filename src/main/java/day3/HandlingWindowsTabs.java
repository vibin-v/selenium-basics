package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindowsTabs {

     public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        WebElement newWindowBtn = driver.findElement(By.id("newWindowBtn"));
        newWindowBtn.click();
        String parentWindow = driver.getWindowHandle();
        System.out.println("ParentWindow:" +parentWindow);

        Thread.sleep(5000);

        Set <String> allWindow = driver.getWindowHandles();
        for (String currWindow : allWindow) {
            System.out.println(currWindow);
            if (!currWindow.equals(parentWindow)) {
                System.out.println("New Window found!!!");
                driver.switchTo().window(currWindow);
                driver.manage().window().maximize();
                driver.findElement(By.id("firstName")).sendKeys("Heiiiiiii");;
            }
            else
            {
                System.out.println("OLD window found!!!");
            }

        }
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("name")).sendKeys("hellowwwwwwwwww");
        
     }
}
