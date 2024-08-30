package day3;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingBootstrap {
     public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","force-device-scale-factor=0.75");
        
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://getbootstrap.com/docs/5.3/components/dropdowns/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.findElement(By.xpath("//h3[@id='single-button']/following-sibling::div/div/div/button")).click();

       // WebElement dropdown1 = driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/li[2]/a"));
       // System.out.println(dropdown1.getText());

       List<WebElement> ddItems = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']/li"));
       for (WebElement ddOption : ddItems)
        {
            System.out.println(ddOption.getText());
       }

     }
        
}
