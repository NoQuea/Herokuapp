import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NotificationMessage extends BaseTest{

    @Test
    public void message(){

        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
            try {
                driver.findElement(By.xpath("//a[@href='/notification_message']")).click();
            } catch (Exception e) {
                driver.findElement(By.xpath("//div[@class='flash notice']/Action unsuccesful, please try again"));
            }
    }
}
