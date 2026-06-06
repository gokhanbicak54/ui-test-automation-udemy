package tests.K04_WebDriverOlusturmaVeKullanma;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // 1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

        // 2. Sayfa basligini(title) yazdirin.
        System.out.println(driver.getTitle());

        // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin.
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        Assertions.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // 4. Sayfa adresini(url) yazdirin.
        System.out.println(driver.getCurrentUrl());

        // 5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedUrl = "https://testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl, "Test FAILED"); // Test burada takılıyor hata var. JUnit'ten dolayı test devam etmiyor.

        // 6. Sayfa handle degerini yazdirin.
        System.out.println(driver.getWindowHandle());

        // 7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin.
        String expectedPageSourceIcerik = "otomasyon";
        String actualPageSource = driver.getPageSource();
        Assertions.assertTrue(actualPageSource.contains(expectedPageSourceIcerik));

        // 8. Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}