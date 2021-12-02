package testsBaseLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class CheckBoxesTest extends BaseTest {


    String xpathCheckbox = "//input[@type='checkbox']";

    @Test
    public void checkBox() {

        driver.get("http://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkBoxes = driver.findElements(By.xpath(xpathCheckbox));

        checkBoxes.get(0);
        assertFalse(driver.findElement(By.xpath(xpathCheckbox))
                .isSelected());

        checkBoxes.get(0).click();
        assertTrue(driver.findElement(By.xpath(xpathCheckbox))
                .isSelected());

        checkBoxes.get(1);
        assertTrue(driver.findElement(By.xpath(xpathCheckbox))
                .isSelected());

        checkBoxes.get(1).click();
        assertFalse(driver.findElement(By.xpath(xpathCheckbox))
                .isSelected());

    }

}
