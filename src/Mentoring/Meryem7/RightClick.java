package Mentoring.Meryem7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class RightClick extends BaseStaticDriver {
    public static void main(String[] args) {
     driver.get("https://demoqa.com/buttons");

        WebElement rightbutton= driver.findElement(By.id("rightClickBtn"));

        Actions builder=new Actions(driver);
        builder.contextClick(rightbutton).perform();

    }
}
