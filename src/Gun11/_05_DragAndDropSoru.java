package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

/*
   Senaryo :
   1- http://demo.guru99.com/test/drag_drop.html Siteyi açınız.
   2- Bank butonunu sürükleyerek bağtaki kutucuğa bırakınız.
   3- Daha sonra bütün kutularda BANK butonunun textini aratınız.
   4- Assert ile doğrulayınız.
 */

public class _05_DragAndDropSoru extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");


        WebElement credit=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        WebElement bank=driver.findElement(By.xpath("//*[@id='bank']/li"));

        Actions act=new Actions(driver);
        Action build=act.dragAndDrop(credit, bank).build();
        build.perform();
        WebElement mesaj=driver.findElement(By.xpath("(//li[@data-id='5'])[2]"));

        Assert.assertEquals("BANK",mesaj.getText());

        Thread.sleep(5000);
        driver.quit();
    }
}
