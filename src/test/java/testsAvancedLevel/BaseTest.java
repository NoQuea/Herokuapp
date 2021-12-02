package testsAvancedLevel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FileUploadPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FileUploadPage fileUploadPage;

    Actions actions;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploadPage = new FileUploadPage(driver);

        actions = new Actions(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
