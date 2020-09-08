package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import utils.BaseStaticDriver;

public class ActionHoverTest1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");

       WebElement bankBtn= driver.findElement(By.cssSelector("#credit2>a"));
        Actions builder=new Actions(driver);
        Action build=builder.moveToElement(bankBtn).build();
        System.out.println("Üzerine maus gelmeden önceki renk: "+ Color.fromString(bankBtn.getCssValue("color")).asHex());
        build.perform();
        System.out.println("Üzerine maus geldikten sonra renk: "+Color.fromString(bankBtn.getCssValue("color")).asHex());
                                                              //rengi farklı formatta yazıyor


        Thread.sleep(2000);
        driver.quit();
    }
}
