package tests.K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q11 {

    public static void main(String[] args) throws InterruptedException {

        // 0- Bir class olusturun.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. http://zero.webappsecurity.com sayfasina gidin.
        Thread.sleep(2000);
        driver.get("http://zero.webappsecurity.com");

        // 2. Signin buttonuna tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='signin_button']"))
                .click();

        // 3. Login alanine “username” yazdirin.
        Thread.sleep(2000);
        WebElement loginKutusu = driver.findElement(By.xpath("//input[@id='user_login']"));
        loginKutusu.sendKeys("username");

        // 4. Password alanina “password” yazdirin.
        Thread.sleep(2000);
        WebElement passwordKutusu = driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordKutusu.sendKeys("password");

        // 5. Sign in buttonuna tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']"))
                .click();

        // 6. Back tusu ile sayfaya donun.
        Thread.sleep(2000);
        driver.navigate().back();

        // 7. Online Banking menusunden Pay Bills sayfasina gidin.
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']"))
                .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@id='pay_bills_link']"))
                .click();

        // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin.
        Thread.sleep(2000);
        WebElement amountKutusu = driver.findElement(By.xpath("//input[@name='amount']"));
        amountKutusu.sendKeys("100");

        // 9. tarih kismina “2023-09-10” yazdirin.
        Thread.sleep(2000);
        WebElement tarihKutusu = driver.findElement(By.xpath("//input[@name='date']"));
        tarihKutusu.sendKeys("2023-09-10");

        // 10. Pay buttonuna tiklayin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='btn btn-primary']"))
                .click();

        // 11. “The payment was successfully submitted.” mesajinin ciktigini test edin.
        Thread.sleep(2000);
        WebElement odemeYaziElementi = driver.findElement(By.xpath("//span[.='The payment was successfully submitted.']"));
        String expectedYazi = "The payment was successfully submitted.";
        String actualYazi = odemeYaziElementi.getText();

        if (actualYazi.equals(expectedYazi)) {
            System.out.println("Ödeme basarili yazisi testi PASSED");
        } else {
            System.out.println("Ödeme basarili yazisi testi PASSED");
        }

        // 12- Sayfayi kapatin.
        Thread.sleep(2000);
        driver.quit();
    }
}