package testsAvancedLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void findCheckBox() {

        dynamicControlsPage.open();
        dynamicControlsPage.findCheckBox();
        Assert.assertEquals(dynamicControlsPage.findCheckBox(), 1, "No element");

    }

    @Test
    public void clickOnButtonAndWaitItsGone() {

        dynamicControlsPage.open();
        dynamicControlsPage.clickRemove();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(dynamicControlsPage.itsGone(), "It's gone!", "Massage did not load");
        Assert.assertEquals(dynamicControlsPage.findCheckBox(), 0, "We are have an element");

    }

    @Test
    public void findInput() {

        dynamicControlsPage.open();
        Assert.assertFalse(dynamicControlsPage.input(), "Input enabled");

        actions.moveToElement(dynamicControlsPage.buttonEnable()).click().build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        Assert.assertTrue(dynamicControlsPage.input(), "Input enabled");

        Assert.assertEquals(dynamicControlsPage.buttonEnableOrDisableText(), "Disable", "Text not as expected");

    }
}
