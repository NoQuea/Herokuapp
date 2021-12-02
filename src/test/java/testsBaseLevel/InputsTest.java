package testsBaseLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class InputsTest extends BaseTest {
    String xpathNumber = "//input[@type='number']";

    @Test
    public void enterVariousDigitalAndNotDigitalValues() {


        driver.get("http://the-internet.herokuapp.com/inputs");


        WebElement value = driver.findElement(By.tagName("input"));

        Actions actions = new Actions(driver);

        actions.moveToElement(value).click().sendKeys(Keys.ARROW_UP).perform();
        assertEquals(value.getAttribute("value"), "1");

        actions.moveToElement(value).click().sendKeys(Keys.ARROW_DOWN).perform();
        assertEquals(value.getAttribute("value"), "0");

        value.sendKeys(Keys.ARROW_UP);
        assertEquals(value.getAttribute("value"), "1");

        value.sendKeys(Keys.ARROW_DOWN);
        assertEquals(value.getAttribute("value"), "0");

    }

}
