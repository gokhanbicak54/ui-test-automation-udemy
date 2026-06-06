package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.testotomasyonu.com adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.testotomasyonu.com");

        // 3- Urun arama kutusunu locate edin.
        Thread.sleep(2000);
        WebElement aramaKutusuElementi = driver.findElement(By.xpath("//input[@class='search-input']"));

        // 4- Arama kutusuna “shoe” yazdirin.
        Thread.sleep(2000);
        aramaKutusuElementi.sendKeys("shoe");

        // 5- Arama islemini yapabilmek icin ENTER tusuna basin.
        Thread.sleep(2000);
        aramaKutusuElementi.submit();

        // 6- Arama sonucunda urun bulunabildigini test edin.
        Thread.sleep(2000);
        WebElement aramaSonucElementi = driver.findElement(By.xpath("//span[text()='4 Products Found']"));
        System.out.println(aramaSonucElementi.getText());

        String aramaSonucElementiStr = aramaSonucElementi.getText();
        aramaSonucElementiStr = aramaSonucElementiStr.replaceAll("\\D", "");

        int aramaSonucElementiInt = Integer.parseInt(aramaSonucElementiStr);

        if (aramaSonucElementiInt > 0) {
            System.out.println("Arama sonuc testi PASSED");
        } else {
            System.out.println("Arama sonuc testi FAILED");
        }

        // 7- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}