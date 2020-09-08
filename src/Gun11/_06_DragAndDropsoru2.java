package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _06_DragAndDropsoru2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");


        WebElement credit=driver.findElement(By.id("credit1"));

        WebElement kutu=driver.findElement(By.id("loan"));

        Actions builder=new Actions(driver);
        //1. yöntem
       /* Action build=builder.dragAndDrop(credit, kutu).build();
        build.perform();*/
        //2. yöntem
        Action buld1= builder.clickAndHold(credit).moveToElement(kutu).release().build();
        buld1.perform();
        //kredit i tıklat eline al,sonra hedefe git,sonra yerine bırak

        Thread.sleep(2000);
        driver.quit();
    }
}
