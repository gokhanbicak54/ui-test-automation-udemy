package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q12 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir class olusturun.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.google.com/ adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.google.com/");

        // 3- cookies uyarisini kabul ederek kapatin.
        Thread.sleep(2000);

        // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin.
        Thread.sleep(2000);
        String expectedTitleIcerik = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Baslik testi PASSED");
        } else {
            System.out.println("Baslik testi FAILED");
        }

        // 5- Arama cubuguna “Nutella” yazip aratin.
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("Nutella" + Keys.ENTER);

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}