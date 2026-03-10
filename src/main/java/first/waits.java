package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement txtUsername = mywait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))
        );
        txtUsername.sendKeys("Admin");

        WebElement txtpassword = mywait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))
        );
        txtpassword.sendKeys("admin123");

        WebElement loginbtn = mywait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))
        );
        loginbtn.click();
    }
}