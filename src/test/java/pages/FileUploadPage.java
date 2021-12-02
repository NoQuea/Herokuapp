package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage extends BasePage {

    File file = new File("src/test/resources/1_small-4.jpg");

    public static final By FILE_UPLOAD_BUTTON = By.id("file-upload");
    public static final By FILE_SUBMIT_BUTTON = By.id("file-submit");
    public static final By FILE_UPLOADED = By.xpath("//div[@class='example']/h3");


    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(herokuapp+"upload");
    }


    public void downloadInUploadPicture(){
        driver.findElement(FILE_UPLOAD_BUTTON).sendKeys(file.getAbsolutePath());

    }
    public void clickSubmitButton(){
        driver.findElement(FILE_SUBMIT_BUTTON).click();
    }

    public String fileUploaded(){
        return driver.findElement(FILE_UPLOADED).getText();
    }
}
