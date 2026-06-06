package tests.K04_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {

    public static void main(String[] args) throws InterruptedException {

        // 1. Yeni bir class olusturalim.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title)
        // “facebook” oldugunu test edin, degilse dogru basligi yazdirin.
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");

        String expectedFacebookTitle = "facebook";
        String actualFacebookTitle = driver.getTitle();

        if (actualFacebookTitle.equals(expectedFacebookTitle)) {
            System.out.println("Facebook Başlık Testi: PASSED");
        } else {
            System.out.println("Facebook Başlık Testi: FAILED. Doğru Başlık: " + actualFacebookTitle);
        }

        // 3. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        Thread.sleep(2000);
        String expectedFacebookUrlIcerik = "facebook";
        String actualFacebookUrl = driver.getCurrentUrl();

        if (actualFacebookUrl.contains(expectedFacebookUrlIcerik)) {
            System.out.println("Url facebook kelimesini iceriyor");
        } else {
            System.out.println("Gercek Url: " + actualFacebookUrl);
        }

        // 4. https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(2000);
        driver.navigate().to("https://www.walmart.com/");

        // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        /*
        Thread.sleep(2000);
        String expectedWalmartTitleIcerik = "Walmart.com";
        String actualWalmartTitle = driver.getTitle();
        Assertions.assertTrue(actualWalmartTitle.contains(expectedWalmartTitleIcerik));
         */

        // 6. Tekrar “facebook” sayfasina donun.
        Thread.sleep(2000);
        driver.navigate().back();

        // 7. Sayfayi yenileyin.
        Thread.sleep(2000);
        driver.navigate().refresh();

        // 8. Sayfayi tam sayfa (maximize) yapin.
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        // 9. Browser’i  kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}