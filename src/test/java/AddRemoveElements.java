import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.*;

public class AddRemoveElements extends BaseTest {

    String deleteButtonLocator = "[onclick='deleteElement()']";

    @Test
    public void test1() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton = driver.findElement(By.cssSelector("[onclick='addElement()']"));
        addButton.click();
        addButton.click();

        List<WebElement> deleteButton = driver.findElements(By.cssSelector(deleteButtonLocator));
        assertEquals(deleteButton.size(), 2, "Колчество элементов не равно 2");

        deleteButton.get(1).click();
        deleteButton = driver.findElements(By.cssSelector(deleteButtonLocator));
        assertEquals(deleteButton.size(), 1, "Колчество элементов не равно 1");

    }
}
