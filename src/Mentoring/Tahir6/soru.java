package Mentoring.Tahir6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class soru extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        WebElement akzeptiert= driver.findElement(By.cssSelector("button[class='wt-btn wt-btn--secondary wt-width-full']"));
        akzeptiert.click();

       WebElement face= driver.findElement(By.xpath("(//a[@class='wt-text-caption wt-arrow-link wt-arrow-link--forward'])[1]"));
       face.click();

       Thread.sleep(2000);
       WebElement ulke= driver.findElement(By.xpath("//select[@id='ship_to_select']"));
        Select ulkesec=new Select(ulke);
        ulkesec.selectByVisibleText("Rumänien");
        Thread.sleep(2000);

    }
}
