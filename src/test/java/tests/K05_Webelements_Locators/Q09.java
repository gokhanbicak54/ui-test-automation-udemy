package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q09 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir class olusturun.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.testotomasyonu.com/ adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.testotomasyonu.com/");

        // 3- Browseri tam sayfa yapin.
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // 4- Sayfayi “refresh” yapin.
        Thread.sleep(2000);
        driver.navigate().refresh();

        // 5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin.
        Thread.sleep(2000);
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }

        // 6- Furniture linkine tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='Furniture'])[3]"))
                .click();

        // 7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin.
        Thread.sleep(2000);
        WebElement minSearchBox = driver.findElement(By.xpath("//input[@class='form-control minPrice']"));
        WebElement maxSearchBox = driver.findElement(By.xpath("//input[@class='form-control maxPrice']"));

        minSearchBox.clear();
        minSearchBox.sendKeys("40");
        maxSearchBox.clear();
        maxSearchBox.sendKeys("200");

        driver.findElement(By.xpath("//button[text()='Filter Price']"))
                .click();

        // 8- Filtreleme sonucunda urun bulunabildigini test edin.
        Thread.sleep(2000);
        List<WebElement> filtrelemeSonuclari = driver.findElements(By.xpath("//div[@class='product-box mb-2 pb-1']"));

        if (!filtrelemeSonuclari.isEmpty()) {
            System.out.println("Urun bulunabilirlik testi PASSED");
        } else {
            System.out.println("Urun bulunabilirlik testi FAILED");
        }

        // 9- Ilk urunu tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='product-box mb-2 pb-1'])[1]"))
                .click();

        // 10- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin.
        Thread.sleep(2000);
        WebElement urunFiyatElementi = driver.findElement(By.xpath("//span[@id='priceproduct']"));
        String urunFiyatıElementiStr = urunFiyatElementi.getText(); // $50.00
        urunFiyatıElementiStr = urunFiyatıElementiStr.replaceAll("\\D", ""); // 5000
        Double urunFiyatElementiDouble = Double.parseDouble(urunFiyatıElementiStr) / 100;

        if (urunFiyatElementiDouble > 40 && urunFiyatElementiDouble < 200) {
            System.out.println("Urun fiyat testi PASSED");
        } else {
            System.out.println("Urun fiyat testi PASSED");
        }

        // 11- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}