package testsBaseLevel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    String value1 = "//option[@value='1']";
    String value2 = "//option[@value='2']";

    @Test
    public void dropdown(){
        String idDropdown = "dropdown";

        driver.get("http://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.id(idDropdown)).click();
        driver.findElement(By.xpath(value1)).click();
        Assert.assertTrue(driver.findElement(By.xpath(value1))
                .isSelected());

        driver.findElement(By.id(idDropdown)).click();
        driver.findElement(By.xpath(value2)).click();
        Assert.assertTrue(driver.findElement(By.xpath(value2))
                .isSelected());

    }
}
