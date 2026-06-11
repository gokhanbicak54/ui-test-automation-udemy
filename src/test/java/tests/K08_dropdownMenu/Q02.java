package tests.K08_dropdownMenu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase_Each;

public class Q02 extends TestBase_Each {

    @Test
    public void test01() {
        // 0. https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın.
        WebElement ddmHerokuapp = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(ddmHerokuapp);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın.
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın.
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        // 4.Tüm dropdown değerleri(value) yazdırın.
        System.out.println(ddmHerokuapp.getText());

        // 5. Dropdown’un boyutunun 4 olduğunu test edin.
        int expectedDdmSize = 4;
        int actualDdmSize = select.getOptions().size(); // 3
        Assertions.assertEquals(expectedDdmSize, actualDdmSize); // hata verir
    }
}