package Gun9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class selProjrct2_3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement login= driver.findElement(By.cssSelector("input[id='user_login']"));
        login.sendKeys("username");
        WebElement password= driver.findElement(By.cssSelector("input[id='user_password']"));
        password.sendKeys("password");

        WebElement sign_in=driver.findElement(By.cssSelector("input[name='submit']"));
        sign_in.click();

        WebElement paybils=driver.findElement(By.xpath("//a[text()='Pay Bills']"));
        paybils.click();
        Thread.sleep(1000);

        WebElement currency=driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']"));
        currency.click();
        Thread.sleep(1000);

        int random=(int)(Math.random()*15+1);
        WebElement currencysec=driver.findElement(By.id("pc_currency"));
        Select selectpD=new Select(currencysec);
        selectpD.selectByIndex(random);

        WebElement amaunt= driver.findElement(By.id("pc_amount"));
        amaunt.sendKeys("5000");


        WebElement usd=driver.findElement(By.id("pc_inDollars_true"));
        usd.click();
        WebElement purchase=driver.findElement(By.id("purchase_cash"));
        purchase.click();

        Thread.sleep(2000);
        driver.quit();

    }
}
