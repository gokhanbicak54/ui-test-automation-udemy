package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q07 {

    public static void main(String[] args) throws InterruptedException {

        // 0- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- https://www.testotomasyonu.com/ sayfasına gidin.
        Thread.sleep(2000);
        driver.get("https://www.testotomasyonu.com/");

        // 2- Arama kutusuna “dress” yazip aratin.
        Thread.sleep(2000);
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='search-input']"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);

        // 3- Görüntülenen sonuçların sayısını yazdırın.
        Thread.sleep(2000);
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//span[@class='product-count-text']"));
        System.out.println(sonucYaziElementi.getText());

        String sonucYaziElementiStr = sonucYaziElementi.getText();
        sonucYaziElementiStr = sonucYaziElementiStr.replaceAll("\\D", "");
        int sonucYaziElementiInt = Integer.parseInt(sonucYaziElementiStr);
        System.out.println("Urun sayisi: " + sonucYaziElementiInt);

        // 4- Listeden ilk urunun resmine tıklayın.
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//img[@class='lazy'])[1]"))
                .click();

        // 5- Urun detayinda dress kelimesi geçtiğini test edin.
        Thread.sleep(2000);
        WebElement urunYaziElementi = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));
        System.out.println(urunYaziElementi.getText());

        if (urunYaziElementi.getText().contains("Dress")) {
            System.out.println("Urun detay kelimesi testi PASSED");
        } else {
            System.out.println("Urun detay kelimesi testi FAILED");
        }

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}