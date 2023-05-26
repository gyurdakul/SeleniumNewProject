package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.getProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //driver.get("https://amazon.com");

        // getTitle() methodu sayfa başlığını verir.
        System.out.println("amazon sayfa başlığı: "+driver.getTitle());

        // getCurrentUrl() --> gidilen sayfanın Url'sini verir.
        driver.get("https://techproeducation.com");
        System.out.println("Techproed actual Url: "+driver.getCurrentUrl());
        System.out.println("Techproed sayfa başlığı: "+driver.getTitle());

        // getPageSource() Açılan sayfanın kaynak kodlarını verir
       // System.out.println(driver.getPageSource());

        //getWindowHandle() -->gidilen sayfanın handle degerini (hashCode) verir.
        // Bu handle degerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle degeri: "+driver.getWindowHandles()); //[685466FC6DFE52E8A16D73233AF5E2D9]
    }
}
