package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _03_ActionRightClickBtn extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        WebElement button= driver.findElement(By.id("rightClickBtn"));

        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(button).contextClick().build();
        Thread.sleep(1000);

        build.perform();

        String  bekledigim="You have done a right click";
        WebElement gercek= driver.findElement(By.id("rightClickMessage"));
        Assert.assertEquals("sonuclar uyuşmuyor",bekledigim,gercek.getText());

        Thread.sleep(6000);
        driver.quit();
    }
}
