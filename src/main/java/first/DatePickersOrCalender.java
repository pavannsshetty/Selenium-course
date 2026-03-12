package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickersOrCalender {

    private static WebDriver driver;

    public static void main (String[] args) throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

//        Switch to frame
        driver.switchTo().frame(0);
//        Method 1: Using sendKeys()
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/11/2026"); //mm/dd/yyyy

//       Method 2: Using data picker
        String year = "2022";
        String month = "April";
        String date = "04";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        while(true){
          String currentMonth =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //current month
//            System.out.println("CurrentMonth: "+currentMonth);
            String currentYear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //current year
//            System.out.println("CurrentMonth: "+currentYear);
            if(currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }else
//                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous button
        }
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        driver.findElement

//        Thread.sleep(5000);
//        driver.quit();
    }
}
