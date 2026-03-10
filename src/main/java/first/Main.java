package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        // Add product to cart
        String act_name = driver.getTitle();
        if(act_name.equals("Swag Labs")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is incorrect");
        }
    try {
        Thread.sleep(5000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        driver.quit();
    }
}