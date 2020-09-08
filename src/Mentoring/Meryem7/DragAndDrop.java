package Mentoring.Meryem7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class DragAndDrop extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://uitestpractice.com/");
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));

        Actions builder=new Actions(driver);
        builder.dragAndDrop(drag,drop).perform();


    }
}
