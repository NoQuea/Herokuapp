import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Inputs extends BaseTest{

    @Test
    public void enterVariousDigitalAndNotDigitalValues() {

        driver.get("http://the-internet.herokuapp.com/inputs");


        WebElement value = driver.findElement(By.tagName("input"));
        Actions actions = new Actions(driver);

        actions.moveToElement(value).click().sendKeys(Keys.ARROW_UP).perform();
        actions.moveToElement(value).click().sendKeys(Keys.ARROW_DOWN).perform();

        value.sendKeys(Keys.ARROW_UP);
        value.sendKeys(Keys.ARROW_DOWN);

    }

}
