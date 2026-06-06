package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Q05 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- http://zero.webappsecurity.com/ adresine gidin.
        Thread.sleep(2000);
        driver.get("http://zero.webappsecurity.com/");

        // 3- “ONLINE BANKING” linkine tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[text()='Online Banking']"))
                .click();

        // 4- Resim altinda 6 islem basligi oldugunu test edin.
        Thread.sleep(2000);
        List<WebElement> baslikElementleriList = driver.findElements(By.className("headers"));
        int expectedBaslikSayisi = 6;
        int actualBaslikSayisi = baslikElementleriList.size();

        if (expectedBaslikSayisi == actualBaslikSayisi) {
            System.out.println("Element sayisi testi PASSED");
        } else {
            System.out.println("Element sayisi testi FAILED");
        }

        // 5- Islem basliklari icinde “Pay Bills” oldugunu test edin.
        Thread.sleep(2000);
        List<String> baslikYazilariList = new ArrayList<>();

        for (WebElement each : baslikElementleriList) {
            baslikYazilariList.add(each.getText());
        }

        if (baslikYazilariList.contains("Pay Bills")) {
            System.out.println("Pay Bills testi PASSED");
        } else {
            System.out.println("Pay Bills testi FAILED");
        }

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}