package testsBaseLevel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {
    @Test
    public void checkParagraphSpelling(){
        driver.get("http://the-internet.herokuapp.com/typos");


            driver.findElement(By.tagName("p"));
            Assert.assertEquals("Sometimes you'll see a typo, other times you won't.",
                    "Sometimes you'll see a typo, other times you won't.");

    }
}
