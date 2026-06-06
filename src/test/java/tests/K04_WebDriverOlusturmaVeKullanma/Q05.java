package tests.K04_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {

    public static void main(String[] args) throws InterruptedException {

        // 1. Yeni bir class olusturun. (TekrarTesti)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        // doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Thread.sleep(2000);
        driver.get("https://www.youtube.com/");
        String expectedYoutubeTitle = "youtube";
        String actualYoutubeTitle = driver.getTitle();

        if (actualYoutubeTitle.equals(expectedYoutubeTitle)) {
            System.out.println("Beklenen Youtube Title: " + expectedYoutubeTitle);
        } else {
            System.out.println("Gercek Youtube Title: " + actualYoutubeTitle);
        }

        // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa doğru URL'yi yazdırın.
        Thread.sleep(2000);
        String expectedYoutubeUrlIcerik = "youtube";
        String actualYoutubeUrl = driver.getCurrentUrl();

        if (actualYoutubeUrl.contains(expectedYoutubeUrlIcerik)) {
            System.out.println("Beklenen Youtube Url icerigi: " + expectedYoutubeUrlIcerik);
        } else {
            System.out.println("Gercek Youtube Url: " + actualYoutubeUrl);
        }

        // 4. Daha sonra testotomasyonu sayfasina gidin. https://www.testotomasyonu.com/
        Thread.sleep(2000);
        driver.navigate().to("https://www.testotomasyonu.com/");

        // 5. Youtube sayfasina geri donun.
        Thread.sleep(2000);
        driver.navigate().back();

        // 6. Sayfayi yenileyin.
        Thread.sleep(2000);
        driver.navigate().refresh();

        // 7. Testotomasyonu sayfasina donun.
        Thread.sleep(2000);
        driver.navigate().forward();

        // 8. Sayfayi tamsayfa yapin.
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        // 9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        Thread.sleep(2000);
        String expectedTestOtomasyonuTitleIcerik = "Test";
        String actualTestOtomasyonuTitle = driver.getTitle();

        if (actualTestOtomasyonuTitle.contains(expectedTestOtomasyonuTitleIcerik)) {
            System.out.println("Beklenen Test Otomasyonu Title Icerigi: " + expectedTestOtomasyonuTitleIcerik);
        } else {
            System.out.println("Gercek Test Otomasyonu Title" + actualTestOtomasyonuTitle);
        }

        // 10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
        // degilse doğru URL'yi yazdırın.
        Thread.sleep(2000);
        String expectedTestOtomasyonuUrl = "https://www.testotomasyonu.com/";
        String actualTestOtomasyonuUrl = driver.getCurrentUrl();

        if (actualTestOtomasyonuUrl.equals(expectedTestOtomasyonuUrl)) {
            System.out.println("Beklenen Test Otomasyonu Url: " + expectedTestOtomasyonuUrl);
        } else {
            System.out.println("Gercek Test Otomasyonu Url: " + actualTestOtomasyonuUrl);
        }

        // 11.Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}