package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandleDropdown {
    public static void main(String[] args) throws InterruptedException {
//      1) Select dropdown
//      2) Bootstrap dropdown
//      3) Hidden dropdown


//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().window().maximize();

//       1) Select dropdown
//        WebElement dropcountryEl = driver.findElement(By.xpath("//select[@id='country']"));
//        Select dropcountry = new Select(dropcountryEl);

//      dropcountry.selectByVisibleText("India");
//      dropcountry.selectByValue("japan");
//      dropcountry.selectByIndex(5);

//      Total number of options in dropdown
//        List<WebElement> optionsCount = dropcountry.getOptions();
//        System.out.println("Total number of option in dropdown: "+optionsCount.size());
//        for(WebElement total : optionsCount){
//            System.out.println(total.getText());
//        }
//        Thread.sleep(2000);
//        driver.quit();
//    }


//        2) Bootstrap dropdown
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.htmlelements.com/demos/dropdownlist/checkboxes/");
//        driver.manage().window().maximize();
//
//        // switch to iframe
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//
//        // open dropdown
//        driver.findElement(By.xpath("//div[contains(@class,'smart-dropdownlist')]")).click(); //opens dropdown options
//        // Select single option
//        driver.findElement(By.xpath("//smart-list-item[@id='listItem8a35']//span[@class='smart-input']")).click();
//

//        3) Handle Hidden Dropdown

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

//        Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();

    }
}
