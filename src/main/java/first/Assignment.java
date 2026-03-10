package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));

        System.out.println("Total Number of Links appeared: " + links.size());

        for(WebElement link : links){
            System.out.println(link.getText() + " " + link.getAttribute("href"));
        }

        for(int i = 0; i < links.size(); i++){
            links.get(i).click();
        }

        Set<String> winId = driver.getWindowHandles();

        for(String id : winId){
            String title = driver.switchTo().window(id).getTitle();
            if(title.contains("JavaScript - Wikipedia")){
                driver.close();
            }
        }

//        driver.quit();
    }
}