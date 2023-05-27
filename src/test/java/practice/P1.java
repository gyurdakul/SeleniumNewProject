package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
    public static void main(String[] args) {
        /*
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
