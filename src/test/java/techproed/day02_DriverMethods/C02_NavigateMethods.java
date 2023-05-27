package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        techproedication sayfasına gidelim
        sonra amazon sayfasına gidelim
        amazon sayfasının başlığını yazdıralım
        techproeducation sayfasına geri dönelim
        sayfa başlığını yazdıralım
        amazon sayfasına tekrar gidip url'i yazdırın
        Amazon sayfasındayken sayfayı yenileyelim.
         */

        /*
        kodların bir zaman beklemesi için "Thread.sleep" kodu kullanılır
         */


        // techproedication sayfasına gidelim
        driver.navigate().to("https://techproeducation.com"); // get() ile aynı sekilde calışır. Muadilidir.

        Thread.sleep(3000);

        //amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");

        //amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfa baslığı: "+driver.getTitle());

        //techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //sayfa başlığını yazdıralım
        System.out.println("Techproed sayfa baslığı: "+driver.getTitle());

        //amazon sayfasına tekrar gidip url'i yazdırın
        driver.navigate().forward();
        System.out.println("Amazon Url: "+ driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(3000);

        ////Amazon sayfasındayken sayfayı kapatalım.
        driver.close();


    }
}
