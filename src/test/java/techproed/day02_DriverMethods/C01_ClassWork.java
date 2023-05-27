package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /* -> Amazon Sayfasına gidelim
           -> Sayfa başlığının Amazon içerdiğini test edelim
           -> Url'in "https://www.amazom.com" oldugunu test edelim
           -> Sayfayı kapatalım
         */

        //Amazon Sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }

        //Url'in "https://www.amazom.com" oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed "+actualUrl);
        }

        // Sayfayı kapatalım
        driver.close(); // Browser'ı kapatır
        // driver.quit --> birden fazla browser varsa tamamını kapatır.

    }
}
