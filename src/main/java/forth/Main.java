//package forth;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Main {
//    public static void main(String[] args){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.opencart.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Pavan");
//        String title = driver.getTitle();
//        System.out.println(title);
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println(currentUrl);
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
//        String text = driver.findElement(By.tagName("button")).getText();
//        System.out.println(text);
//        String attribute = driver.findElement(By.id("username")).getAttribute();
//        System.out.println(attribute);
//
//    }
//}
