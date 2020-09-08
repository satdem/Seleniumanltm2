package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _09_TuskontrolSoru extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/auto-complete");
        WebElement textInput = driver.findElement(By.id("autoCompleteMultipleContainer"));

        Actions builder = new Actions(driver);
        Action build =builder.moveToElement(textInput).click().sendKeys("b").build();
        build.perform();
        Thread.sleep(2000);

        Action build1=builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        build1.perform();          //asağı in     //entere bas
        Thread.sleep(2000);
        driver.quit();
    }
}
