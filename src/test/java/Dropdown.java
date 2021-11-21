import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest{

    @Test
    public void dropdown(){
        String idDropdown = "dropdown";

        driver.get("http://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.id(idDropdown)).click();
        driver.findElement(By.xpath("//option[@value='1']")).click();
        Assert.assertTrue(true);

        driver.findElement(By.id(idDropdown)).click();
        driver.findElement(By.xpath("//option[@value='2']")).click();
        Assert.assertTrue(true);

    }
}
