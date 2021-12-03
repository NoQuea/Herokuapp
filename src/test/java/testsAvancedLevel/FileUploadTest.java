package testsAvancedLevel;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {

    @Test
    public void downloadPictureCheckNameFile() {
        fileUploadPage.open();
        File file = new File("src/test/resources/1_small-4.jpg");
        fileUploadPage.buttonUpload().sendKeys(file.getAbsolutePath());
        fileUploadPage.clickSubmitButton();
        Assert.assertEquals(fileUploadPage.fileUploaded(), "File Uploaded!", "File not found");
    }
}
