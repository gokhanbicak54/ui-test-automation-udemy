package tests.K04_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. https://www.testotomasyonu.com/ sayfasina gidin.
        driver.get("https://www.testotomasyonu.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin.
        Thread.sleep(2000);
        System.out.println("Baslangic konum: " + driver.manage().window().getPosition());
        System.out.println("Baslangic boyut: " + driver.manage().window().getSize());

        // 3. Sayfayi simge durumuna getirin.
        Thread.sleep(2000);
        driver.manage().window().minimize();

        // 4. Simge durumunda 2 saniye bekleyip sayfayi maximize yapin.
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin.
        Thread.sleep(2000);
        System.out.println("Maximize konum: " + driver.manage().window().getPosition());
        System.out.println("Maximize boyut: " + driver.manage().window().getSize());

        // 6. Sayfayi fullscreen yapin.
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin.
        Thread.sleep(2000);
        System.out.println("Full screen maximize konum: " + driver.manage().window().getPosition());
        System.out.println("Full screen maximize boyut: " + driver.manage().window().getSize());

        // 8. Sayfanin konumunu pixel olarak (50,50)’ye getirin.
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(50,50));

        // 9. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin.
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(1000,500));

        System.out.println("Konum: " + driver.manage().window().getPosition());
        System.out.println("Boyut: " + driver.manage().window().getSize());

        // 10. Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}