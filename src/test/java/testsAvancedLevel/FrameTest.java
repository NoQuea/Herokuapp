package testsAvancedLevel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FrameTest extends BaseTest {

    String frameText = "//body[@id='tinymce']/p";

    @Test
    public void checkTheTextIntoParagraph() {
        framePage.open();
        WebDriver frame = driver.switchTo().frame(framePage.findFrame());
        Assert.assertEquals(frame.findElement(By.xpath(frameText)).getText(),
                "Your content goes here.",
                "Text does not match");
    }
}
