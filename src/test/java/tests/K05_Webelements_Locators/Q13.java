package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q13 {

    public static void main(String[] args) throws InterruptedException {

        // 0- Bir class olusturun.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. “https://www.saucedemo.com” Adresine gidin.
        Thread.sleep(2000);
        driver.get("https://www.saucedemo.com");

        // 2. Username kutusuna “standard_user” yazdirin.
        Thread.sleep(2000);
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameBox.sendKeys("standard_user");

        // 3. Password kutusuna “secret_sauce” yazdirin.
        Thread.sleep(2000);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys("secret_sauce");

        // 4. Login tusuna basin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']"))
                .click();

        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin.
        Thread.sleep(2000);
        WebElement firstProductElementi = driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[1]"));
        String firstProductName = firstProductElementi.getText();
        firstProductElementi.click();

        // 6. Add to Cart butonuna basin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='add-to-cart']"))
                .click();

        // 7. Alisveris sepetine tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']"))
                .click();

        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin.
        Thread.sleep(2000);
        WebElement sepettekiUrun = driver.findElement(By.xpath("//a[.='Sauce Labs Backpack']"));
        String expectedProductName = firstProductName;
        String actualProductName = sepettekiUrun.getText();

        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Sepetteki urun testi PASSED");
        } else {
            System.out.println("Sepetteki urun testi FAILED");
        }

        // 9. Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}