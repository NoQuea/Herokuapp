package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage {

    public static final By CONTEXT_MENU = By.xpath("//div[@class='example']/h3");
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }


    public void open(){
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }

    public String setContextMenu(){
        return driver.findElement(CONTEXT_MENU).getText();
    }
}
