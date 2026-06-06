package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q03 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.testotomasyonu.com/ adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.testotomasyonu.com/");

        // 3- Arama kutusuna phone yazip aratin.
        Thread.sleep(2000);
        WebElement aramaKutusuElementi = driver.findElement(By.xpath("//input[@class='search-input']"));
        aramaKutusuElementi.sendKeys("phone");
        Thread.sleep(2000);
        aramaKutusuElementi.submit();

        // 4- Category bolumunde 8 element oldugunu test edin.
        Thread.sleep(2000);
        List<WebElement> kategoriELementleriList = driver.findElements(By.className("panel-list"));
        int expectedElementSayisi = 8;
        int actualElementSayisi = kategoriELementleriList.size();

        if (actualElementSayisi == expectedElementSayisi) {
            System.out.println("Element sayisi testi PASSED");
        } else {
            System.out.println("Element sayisi testi FAILED");
        }

        // 5- Category isimlerini yazdirin.
        Thread.sleep(2000);
        for (int i = 0; i < kategoriELementleriList.size(); i++) {
            System.out.println(kategoriELementleriList.get(i).getText());
        }

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}