package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class NavigationMethods {
    @Test
    public static void main(String[] arg)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/");

        driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();
    }
}
