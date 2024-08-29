package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsClass {

    public static void main(String[] args)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com/");

        WebElement printLink = driver.findElement(By.linkText("Forgotten password?"));
        String linkTxt = printLink.getText();
        System.out.println(linkTxt);

        /*
    
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("L");
        driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("H");
        driver.findElement(By.id("email")).sendKeys("E");
        driver.findElement(By.linkText("Forgotten password?"));

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("H");
        driver.findElement(By.id("email")).sendKeys("E");

        driver.findElement(By.cssSelector("#reg_pages_msg>a")).click();
     
         */
    }
    
}
