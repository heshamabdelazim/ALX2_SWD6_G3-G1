import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        System.out.println("This is khalil!");
        System.out.println("It's khalil again!");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("google.com"); //in hesham PC
        System.out.print("hello philip");
    }

}