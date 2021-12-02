package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    String herokuapp = "http://the-internet.herokuapp.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
