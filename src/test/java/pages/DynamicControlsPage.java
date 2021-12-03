package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControlsPage extends BasePage {


    public static final By CHECKBOX = By.xpath("//input[@type='checkbox']");
    public static final By BUTTON_REMOVE = By.xpath("//form[@id='checkbox-example']/button");
    public static final By TEXT_ITSGONE = By.xpath("//p[@id='message']");
    public static final By INPUT = By.xpath("//input[@type='text']");
    public static final By BUTTON_ENABLE_DISABLE = By.xpath("//form[@id='input-example']/button");


    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(herokuapp + "dynamic_controls");
    }

    public int findCheckBox() {
        return driver.findElements(CHECKBOX).size();
    }

    public void clickRemove() {
        driver.findElement(BUTTON_REMOVE).click();
    }

    public String itsGone() {
        return driver.findElement(TEXT_ITSGONE).getText();
    }

    public boolean input() {
        return driver.findElement(INPUT).isEnabled();
    }

    public WebElement buttonEnable() {
        return driver.findElement(BUTTON_ENABLE_DISABLE);
    }

    public String buttonEnableOrDisableText() {
        return driver.findElement(BUTTON_ENABLE_DISABLE).getText();
    }
}
