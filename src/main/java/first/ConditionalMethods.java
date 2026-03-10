package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        boolean DisplayedOrNot = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Logo is displayed "+DisplayedOrNot);
        boolean EnabledOrNot = driver.findElement(By.xpath("//label[normalize-space()='Male']")).isEnabled();
        System.out.println("Radio button is is enabled "+EnabledOrNot);
        driver.quit();
    }
}
