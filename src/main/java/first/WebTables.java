package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTables {
    public static void main (String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//      1) Static web table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//        System.out.println("Total number of rows in table: "+rows);
        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//        System.out.println("Total number of rows in table: "+cols);

//      1.1) Read data from specific row and column
//          WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
//          System.out.println("Table data: "+data.getText());
//      1.2) Print all data from data
//            for(int i=2;i<=rows;i++){
//                for(int j=1;j<=cols;j++){
//                    WebElement value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"));
//                    System.out.print(value.getText() + "\t");
//                }
//                System.out.println();
//            }
//      1.3) Print the books name written by specific author
//        for(int i=2;i<=rows;i++){
//                String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
//                if(authorName.equals("Mukesh")){
//                    String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
//                    System.out.println(bookName);
//                }
//            }
//      1.4) Total sum of price

//        int sum = 0;
//        System.out.println("---------------------------------");
//        for(int i=2;i<=rows;i++) {
//            String priceText = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[4]")).getText();
//            int price = Integer.parseInt(priceText);
//            sum = sum + price;
//
//            System.out.println("\t"+ priceText);
//        }
//        System.out.println("---------------------------------");
//            System.out.println("Total price of books: "+sum);
//        System.out.println("---------------------------------");


//      2) Dynamic web table
//        a) Rows
//        int rows =  driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
//        System.out.println("Total number of rows in table: "+rows);
//        b) Columns
//        int cols =  driver.findElements(By.xpath("//table[@id='taskTable']//th")).size();
//        System.out.println("Total number of rows in table: "+cols);

//      3) Pagination Web Table
//        int rows = driver.findElements(By.xpath("")).size();
//        Thread.sleep(2000);
        driver.quit();
    }
}
