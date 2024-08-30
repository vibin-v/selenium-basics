package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicHTMLControls {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

        driver.findElement(By.id("firstName")).sendKeys("James");;

        driver.findElement(By.id("femalerb")).click();

        driver.findElement(By.id("hindichbx")).click();

        driver.findElement(By.id("chinesechbx")).click();

        driver.findElement(By.id("registerbtn")).click();

        WebElement labelHYR = driver.findElement(By.xpath("//label[@class='inp']/b"));
        System.out.println(labelHYR.getText());
        

    }
}
