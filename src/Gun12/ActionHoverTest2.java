package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class ActionHoverTest2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.etsy.com/");
        driver.manage().deleteAllCookies();

        WebElement akzeptieren= driver.findElement(By.cssSelector("[class='wt-btn wt-btn--secondary wt-width-full']"));
        akzeptieren.click();

        WebElement xx= driver.findElement(By.id("catnav-primary-link-10923"));
        Actions builder=new Actions(driver);
        Action build=builder.moveToElement(xx).build();
        build.perform();
        Thread.sleep(2000);

        WebElement yy= driver.findElement(By.id("side-nav-category-link-10941"));
        build=builder.moveToElement(yy).build();
        build.perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
