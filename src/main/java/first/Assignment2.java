package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();

        double minPrice = Double.MAX_VALUE;

        for(int i = 1; i <= rows; i++){

            String priceText = driver.findElement(
                    By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[6]")
            ).getText();

            priceText = priceText.replace("$","");

            double price = Double.parseDouble(priceText);

            if(price < minPrice){
                minPrice = price;
            }
        }

        System.out.println("Minimum Price: $" + minPrice);

        driver.quit();
    }
}