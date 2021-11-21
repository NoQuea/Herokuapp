import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Typos extends BaseTest{
    @Test
    public void checkParagraphSpelling(){
        driver.get("http://the-internet.herokuapp.com/typos");


        if (true){

            driver.findElement(By.tagName("p"));
            Assert.assertEquals("Sometimes you'll see a typo, other times you won't.",
                    "Sometimes you'll see a typo, other times you won't.");

        } else {
            driver.findElement(By.tagName("p"));
            Assert.assertEquals("Sometimes you'll see a typo, other times you won,t.",
                    "Sometimes you'll see a typo, other times you won't.");
        }
    }
}
