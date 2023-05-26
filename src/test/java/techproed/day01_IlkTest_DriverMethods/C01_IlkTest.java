package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        // java uygulamalarında sistem özelliklerini ayarlamak için setProperty methodu ile kullanırız.
        // setProperty ile class'ımıza driver'ın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("chromeDriver")); // getProperty ile key girdik value verecek.
        WebDriver driver = new ChromeDriver();
        // crohomeDriver turunde yenir obje olusturduk
        driver.get("https://techproeducation.com"); //get methodu ile string olarak girilen url'e gidilir




    }
}
