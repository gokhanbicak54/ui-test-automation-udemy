package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q06 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.automationexercise.com/ adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.automationexercise.com/");

        // 3- Sayfada 147 adet link bulundugunu test edin.
        Thread.sleep(2000);
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());
        int expectedLinkSayisi = 147;
        int actualLinkSayisi = linkList.size();

        if (expectedLinkSayisi == actualLinkSayisi) {
            System.out.println("Link sayisi testi PASSED");
        } else {
            System.out.println("Link sayisi testi FAILED");
        }

        // 4- Products linkine tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText(" Products"))
                .click();

        // 5- special offer yazisinin gorundugunu test edin.
        Thread.sleep(2000);
        WebElement specialOfferElementi = driver.findElement(By.xpath("//img[@id='sale_image']"));

        if (specialOfferElementi.isDisplayed()) {
            System.out.println("Special Offer elementi testi PASSED");
        } else {
            System.out.println("Special Offer elementi testi FAILED");
        }

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}