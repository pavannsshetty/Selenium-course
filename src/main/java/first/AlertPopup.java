package first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AlertPopup {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        Thread.sleep(3000);
//        1) Normal alert with OK button
//        driver.switchTo().alert().accept()
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//        myalert.accept();

//      2) Confirmation alert (OK & Cancel button)
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();

//        3) Prompt alert with input field
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//        Thread.sleep(3000);
//        Alert myalert = driver.switchTo().alert();
//        myalert.sendKeys("Hello welcome");
//        Thread.sleep(3000);
//        myalert.accept();

//        4) Authentication popup
//        driver.get("http://the-internet.herokuapp.com/basic_auth");
//        Syntax = http://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}


