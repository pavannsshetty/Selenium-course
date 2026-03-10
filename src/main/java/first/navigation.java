package first;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/register");
//        URL myUrl = new URL("https://demo.nopcommerce.com");
//        driver.navigate().to(myUrl);
        driver.navigate().to("https://demo.nopcommerce.com/register");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();


    }
}
