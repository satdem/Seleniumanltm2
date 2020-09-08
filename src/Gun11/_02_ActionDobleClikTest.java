package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _02_ActionDobleClikTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));

        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(doubleClickButton).click().build();
        Thread.sleep(1000);

        build.perform();

        Thread.sleep(6000);
        driver.quit();
    }
}
