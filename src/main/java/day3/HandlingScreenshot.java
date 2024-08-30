package day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileOutputStream;



public class HandlingScreenshot {

    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","force-device-scale-factor=0.75");
        
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    
        // Cast the WebDriver instance to TakesScreenshot
        TakesScreenshot tScreenshot = (TakesScreenshot)driver;

        // Capture the screenshot and store it as a file
        File tempFile=tScreenshot.getScreenshotAs(OutputType.FILE);
           
        // Copy the screenshot file to the desired location
        FileUtils.copyFile(tempFile, new File("./Screenshots/img3.png"));


    
            /* 
            // Cast WebDriver to TakesScreenshot
            

            // Capture screenshot as Base64 string
            String base64Screenshot = tScreenshot.getScreenshotAs(OutputType.BASE64);

            // Decode the Base64 string to a byte array
            byte[] decodedScreenshot = Base64.getDecoder().decode(base64Screenshot);
        
            // Define the output file path
            String filePath = "./Screenshots/screenshot1.png";

            // Save the screenshot as an image file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                fos.write(decodedScreenshot);
                System.out.println("Screenshot saved to: " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                // Close the browser
                driver.quit();
                }
            */
    




        


    }
}
