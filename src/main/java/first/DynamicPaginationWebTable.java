package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public  class DynamicPaginationWebTable{
    public static void main (String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//        1) Pagination size
        int pages = driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
        System.out.println("Total pages: "+pages);
        boolean found = false;
        for(int p=1;p<=pages;p++) {
            driver.findElement(By.xpath("//ul[@class='pagination']//li[" + p + "]//a")).click();


//        2) row size
            int rowSize = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
            System.out.println("Total rows: " + rowSize);

            for (int i = 1; i <= rowSize; i++) {
                String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + i + "]//td[2]")).getText();
                if (name.equals("Router")) {
                    driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + i + "]//input[@type='checkbox']")).click();
                    found = true;
                    break;
                }
            }

            if(found) break;
        }

//        Thread.sleep(5000);
//        driver.quit();
    }
}
