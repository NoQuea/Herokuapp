package testsAvancedLevel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenu() {
        contextMenuPage.open();

        actions.contextClick(driver.findElement(By.id("hot-spot")))
                .build()
                .perform();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu", "Text is not corrected");
        alert.dismiss();
        Assert.assertEquals(contextMenuPage.setContextMenu(), "Context Menu", "Alert wasn't closed");
    }
}
