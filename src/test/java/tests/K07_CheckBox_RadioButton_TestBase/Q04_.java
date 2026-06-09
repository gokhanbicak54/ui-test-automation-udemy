package tests.K07_CheckBox_RadioButton_TestBase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase_Each;

public class Q04_ extends TestBase_Each {

    @Test
    public void facebookTest() {
        // a. Verilen web sayfasına gidin. https://facebook.com
        driver.get("https://facebook.com");

        // b. Cookies’i kabul edin.
        // c. Create an account buton’una basin.
        driver.findElement(By.xpath("//span[text()='Create new account']"))
                .click();

        // d. Radio button elementlerini locate edin ve size uygun olani secin.
        driver.findElement(By.xpath("//span[text()='Select your gender']"))
                .click();

        // e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin.
    }
}