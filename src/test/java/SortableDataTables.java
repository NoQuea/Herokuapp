import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTables extends BaseTest{

    @Test
    public void checkTheContentsOfSeveralTableCells(){

        driver.get("http://the-internet.herokuapp.com/tables#delete");
        driver.findElement(By.xpath("//table[1]//tr[1]//td[1]"));
        Assert.assertTrue(driver.findElement(By.xpath("//table[1]//tr[1]//td[1]")).isDisplayed());

        driver.findElement(By.xpath("//table[1]//tr[1]//td[6]"));
        Assert.assertTrue(driver.findElement(By.xpath("//table[1]//tr[1]//td[6]")).isDisplayed());

        driver.findElement(By.xpath("//table[2]//tr[1]//td[5]"));
        Assert.assertTrue(driver.findElement(By.xpath("//table[2]//tr[1]//td[5]")).isDisplayed());

        driver.findElement(By.xpath("//table[2]//tr[4]//td[6]"));
        Assert.assertTrue(driver.findElement(By.xpath("//table[2]//tr[4]//td[6]")).isDisplayed());

    }
}
