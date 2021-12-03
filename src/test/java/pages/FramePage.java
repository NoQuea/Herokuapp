package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePage extends BasePage {

    public static final By IFRAME_ID = By.id("mce_0_ifr");


    public FramePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(herokuapp + "iframe");
    }

    public WebElement findFrame() {
        return driver.findElement(IFRAME_ID);
    }

}
