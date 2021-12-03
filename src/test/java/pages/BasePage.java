package pages;

import org.openqa.selenium.WebDriver;

import java.io.File;

public class BasePage {
    WebDriver driver;

    String herokuapp = "http://the-internet.herokuapp.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
