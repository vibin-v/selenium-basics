package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
    public static void main(String[] args) {
         ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement courseList = driver.findElement(By.cssSelector("#course"));

        Select courseSelection = new Select(courseList);

        courseSelection.selectByIndex(1);
        courseSelection.selectByValue("python");
        courseSelection.selectByVisibleText(("Javascript"));

        WebElement ideList = driver.findElement(By.cssSelector("#ide"));

        Select ideSelection = new Select(ideList);

        ideSelection.selectByIndex(2);
        ideSelection.selectByValue("vs");
        ideSelection.selectByVisibleText("Eclipse");

        List <WebElement> allIDE = ideSelection.getOptions();
            for(WebElement webElement : allIDE)
            {
                System.out.println(webElement.getText());
            }

            System.out.println("*********************");

        List <WebElement> ideSelected = ideSelection.getAllSelectedOptions();
            for(WebElement webElement : ideSelected)
            {
                System.out.println(webElement.getText());
            }

            System.out.println("*********************");

        System.out.println(ideSelection.getFirstSelectedOption().getText());
        



    

    }
    
}
