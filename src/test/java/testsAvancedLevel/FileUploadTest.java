package testsAvancedLevel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest{

    @Test
    public void downloadPictureCheckNameFile(){
        fileUploadPage.open();
        fileUploadPage.downloadInUploadPicture();
        fileUploadPage.clickSubmitButton();
        Assert.assertEquals(fileUploadPage.fileUploaded(), "File Uploaded!", "File not found");
    }
}
