package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc' ]")).click();
        Set<String> windowID = driver.getWindowHandles();
//        List<String> windowList = new ArrayList<>(windowID);
//Approach 1
//        String parentID = windowList.get(0);
//        String childID = windowList.get(1);
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(parentID);
//        System.out.println(driver.getTitle());

        // Approach 2
        for(String winID : windowID){
            String title = driver.switchTo().window(winID).getTitle();
            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }
        }
    }
}

