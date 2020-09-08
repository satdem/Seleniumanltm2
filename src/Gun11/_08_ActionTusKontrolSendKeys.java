package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _08_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/auto-complete");

        WebElement textInput = driver.findElement(By.id("autoCompleteSingle"));


        Actions builder = new Actions(driver);
        Action build =builder.moveToElement(textInput).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("hmet").build();
                            // inputa gidildi.// içine tıklandı// büyük harf için önce SHIFT tuşuna basıldı.// büyük harf için önce SHIFT tuşuna basıldı.
        // a tuşuna basığımızda shift basılı olduğundan büyük yazdı // büyük harf için bastığımız tuş kontrolünü geri aldık// kalanını küçük harf yazdı.
        Thread.sleep(2000);
        build.perform();


        Thread.sleep(2000);
        driver.quit();
    }
}
