package Mentoring.Meryem7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class DoubleClick extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://uitestpractice.com/");

        WebElement doubleclick= driver.findElement(By.cssSelector("[name='dblClick']"));
        Actions builder=new Actions(driver);
        builder.doubleClick(doubleclick).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
