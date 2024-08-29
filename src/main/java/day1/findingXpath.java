package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class findingXpath {
	@Test
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Sign in into account']")).click();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.findElement(By.xpath("//a[contains(text(),'Sign in into account')]")).click();

		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.findElement(By.xpath("//input[contains(@value,'Refresh')]")).click();


	}

}
