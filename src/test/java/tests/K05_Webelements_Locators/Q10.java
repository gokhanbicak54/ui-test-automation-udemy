package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q10 {

    public static void main(String[] args) throws InterruptedException {

        // 0- Bir class olusturun.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- testotomasyonu.com anasayfasina gidelim.
        Thread.sleep(2000);
        driver.get("https://www.testotomasyonu.com/");

        // 2- Arama kutusunu locate edelim.
        Thread.sleep(2000);
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='global-search']"));

        // 3- “phone” ile arama yapalim.
        Thread.sleep(2000);
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // 4- Bulunan sonuc sayisini yazdiralim.
        Thread.sleep(2000);
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//span[@class='product-count-text']"));
        System.out.println(sonucYazisiElementi.getText());

        // 5- Ilk urunu tiklayalim.
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='prod-img'])[1]"))
                .click();

        // 6- Urunun stokta var oldugunu test edin.
        Thread.sleep(2000);
        WebElement stokDurumuElementi = driver.findElement(By.xpath("//span[@class='info  greenclr ']"));
        System.out.println(stokDurumuElementi.getText());
        String expectedStokDurumu = "In Stock";
        String actualStokDurumu = stokDurumuElementi.getText();

        if (actualStokDurumu.equals(expectedStokDurumu)) {
            System.out.println("Stok testi PASSED");
        } else {
            System.out.println("Stok testi FAILED");
        }

        // 7- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}