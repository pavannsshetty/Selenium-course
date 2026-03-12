package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes{
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        // 1) Select specific checkbox
//        driver.findElement(By.xpath("//label[@for='monday']")).click();

        // 2) Select all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//        for(int i=0;i<checkboxes.size();i++){
//            checkboxes.get(i).click();
//        }
//        for(WebElement cb : checkboxes){
//            cb.click();
//        }

        // 3) Select last 3 checkboxes
//        for(int i=checkboxes.size()-1;i>3;i--){
//              checkboxes.get(i).click();
//    }

        // 4) select first 3 checkboxes
//        for(int i=0;i<3;i++){
//            checkboxes.get(i).click();
//        }

        // 5)Unselect the checkboxes
//        Thread.sleep(1000);
//        for(int i=0;i<checkboxes.size();i++){
//            checkboxes.get(i).click();
//        }
//        driver.quit();
    }
}
