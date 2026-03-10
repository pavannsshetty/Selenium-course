package second;

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
//        boolean LogoDisplayedOrNot = driver.findElement(By.id("logo")).isDisplayed();
//        System.out.println(LogoDisplayedOrNot);

        //Locators(id,name,linkText, partialLinkText, tagname, classname
        driver.findElement(By.linkText("Tablets")).click();

        driver.findElement(By.tagName("a")).click();

        driver.findElement(By.className("list-inline-item")).click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link : links){
            System.out.println(link.getText());
        }

        List<WebElement> tags = driver.findElements(By.tagName("img"));
        System.out.println(tags.size());
        for(WebElement tag : tags) {
            System.out.println(tag.getText());
        }
    }
}
