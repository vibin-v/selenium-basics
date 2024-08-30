package day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAlerts {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        driver.findElement(By.id("alertBox")).click();
        Alert simpAlert = driver.switchTo().alert();
        Thread.sleep(5000);
        System.out.println(simpAlert.getText());
        simpAlert.accept();

        Thread.sleep(5000);

        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(5000);
        Alert confiAlert = driver.switchTo().alert();
        System.out.println("confiAlert.getText()");
        confiAlert.dismiss();
        Thread.sleep(5000);

        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(5000);
        Alert pAlert = driver.switchTo().alert();
        pAlert.sendKeys("Jomon");
        Thread.sleep(5000);
        pAlert.accept();
        Thread.sleep(5000);


    } 
}
