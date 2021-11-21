import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxes extends BaseTest {

    String clickCheckBox = "//input[@type='checkbox']";

    @Test
    public void checkBox() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkBoxes = driver.findElements(By.xpath(clickCheckBox));

        checkBoxes.get(0);
        Assert.assertTrue(true);

        checkBoxes.get(0).click();
        Assert.assertFalse(false);

        checkBoxes.get(1).click();
        Assert.assertTrue(true);

    }

}
