package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q08 {

    public static void main(String[] args) throws InterruptedException {

        // 0- Bir test class’i olusturun ilgili ayarlari yapin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- https://testotomasyonu.com/addremove/ adresine gidin.
        Thread.sleep(2000);
        driver.get("https://testotomasyonu.com/addremove/");

        // 2- Add Element butonuna basin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Add']"))
                .click();

        // 3- Remove butonu’nun gorunur oldugunu test edin.
        Thread.sleep(2000);
        WebElement removeButonu = driver.findElement(By.xpath("//button[text()='Remove']"));

        if (removeButonu.isDisplayed()) {
            System.out.println("Remove butonu testi PASSED");
        } else {
            System.out.println("Remove butonu testi FAILED");
        }

        // 4- Remove tusuna basin.
        Thread.sleep(2000);
        removeButonu.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin.
        Thread.sleep(2000);
        WebElement addRemoveElementsYazisi = driver.findElement(By.xpath("//*[.='Add/Remove Elements']"));

        if (addRemoveElementsYazisi.isDisplayed()) {
            System.out.println("Add/Remove Elements testi PASSED");
        } else {
            System.out.println("Add/Remove Elements testi FAILED");
        }

        // 6- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}