package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FileUploadPage extends BasePage {

    public static final By FILE_UPLOAD_BUTTON = By.id("file-upload");
    public static final By FILE_SUBMIT_BUTTON = By.id("file-submit");
    public static final By FILE_UPLOADED = By.xpath("//div[@class='example']/h3");


    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(herokuapp + "upload");
    }

    public void clickSubmitButton() {
        driver.findElement(FILE_SUBMIT_BUTTON).click();
    }

    public String fileUploaded() {
        return driver.findElement(FILE_UPLOADED).getText();
    }

    public WebElement buttonUpload() {
        return driver.findElement(FILE_UPLOAD_BUTTON);
    }
}
