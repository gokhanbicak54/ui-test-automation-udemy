package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q04 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.automationexercise.com/ adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.automationexercise.com/");

        // 3- Category bolumundeki elementleri locate edin.
        Thread.sleep(2000);
        List<WebElement> kategoriElementList = driver.findElements(By.xpath("//div[@class='panel panel-default']"));

        // 4- Category bolumunde 3 element oldugunu test edin.
        Thread.sleep(2000);
        int expectedElementSayisi = 3;
        int actualElementSayisi = kategoriElementList.size();

        if (actualElementSayisi == expectedElementSayisi) {
            System.out.println("Element sayisi testi PASSED");
        } else {
            System.out.println("Element sayisi testi FAILED");
        }

        // 5- Category isimlerini yazdirin.
        Thread.sleep(2000);
        for (int i = 0; i < kategoriElementList.size(); i++) {
            System.out.println(kategoriElementList.get(i).getText());
        }

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}