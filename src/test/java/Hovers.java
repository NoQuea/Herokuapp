import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.AssertJUnit.assertTrue;


public class Hovers extends BaseTest{

        String figcaption = "//div[@class='figcaption']/h5";

        @Test
        public void chekTheFirstUser() {

            driver.get("http://the-internet.herokuapp.com/hovers");
            List<WebElement> users = driver.findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(users.get(0)).perform();
            driver.findElement(By.xpath(figcaption));
            assertTrue(true);
            actions.moveToElement(driver.findElement(By.xpath("//a[@href='/users/1']"))).click().perform();
            driver.findElement(By.tagName("h1"));
            assertTrue(true);
        }
        @Test
        public void chekTheSecondUser() {
            driver.get("http://the-internet.herokuapp.com/hovers");
            List<WebElement> users = driver.findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(users.get(1)).perform();
            driver.findElement(By.xpath(figcaption));
            assertTrue(true);
            actions.moveToElement(driver.findElement(By.xpath("//a[@href='/users/2']"))).click().perform();
            driver.findElement(By.tagName("h1"));
            assertTrue(true);
        }
        @Test
        public void chekTheThirdUser() {
            driver.get("http://the-internet.herokuapp.com/hovers");
            List<WebElement> users = driver.findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(users.get(2)).perform();
            driver.findElement(By.xpath(figcaption));
            assertTrue(true);
            actions.moveToElement(driver.findElement(By.xpath("//a[@href='/users/3']"))).click().perform();
            driver.findElement(By.tagName("h1"));
            assertTrue(true);
    }
}

