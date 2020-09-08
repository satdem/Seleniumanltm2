package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _04_ActionDragAndDrop extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       //kaynak:box       hedef:box101
        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norvec= driver.findElement(By.id("box101"));

        Actions builder=new Actions(driver);

        Action build=builder.dragAndDrop(oslo,norvec).build();
        build.perform();

        WebElement roma= driver.findElement(By.id("box6"));
        WebElement italya= driver.findElement(By.id("box106"));

       // Actions builder=new Actions(driver);

        Action build1=builder.dragAndDrop(roma,italya).build();
        build1.perform(); Thread.sleep(5000);
        driver.quit()

       ;
    }
}
