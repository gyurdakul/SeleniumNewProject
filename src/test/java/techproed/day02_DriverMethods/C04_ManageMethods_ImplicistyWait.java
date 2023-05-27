package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class C04_ManageMethods_ImplicistyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        /*
            implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
            Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler.30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */


        //techproed sayfasina gidelim
        driver.get("https://techproeducation.com");

        //amazona gidelim
        driver.get("https://amazon.com");

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini techpro icerdigini test edelim
        String actualTitle= driver.getTitle();
        String expectedTitle = "Techpro";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed "+ actualTitle);
        }

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basligini Amazon icerdigini test edelim
        String actualTitleA= driver.getTitle();
        String expectedTitleA = "Amazon";
        if (actualTitleA.contains(expectedTitleA)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed "+ actualTitleA);
        }

        driver.close();
    }
}
