package third;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();

        //CSS Locators

        driver.findElement(By.cssSelector(".btn"));
        driver.findElement(By.cssSelector("input[type='text']"));
        driver.findElement(By.cssSelector("#btn")).sendKeys("T-shirts");
    }
}
