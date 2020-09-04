package SeleniumProject2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class selProject2_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().deleteAllCookies();

        WebElement login= driver.findElement(By.cssSelector("input[id='user_login']"));
        login.sendKeys("username");
        WebElement password= driver.findElement(By.cssSelector("input[id='user_password']"));
        password.sendKeys("password");

        WebElement sign_in=driver.findElement(By.cssSelector("input[name='submit']"));
        sign_in.click();

        WebElement transferFounds=driver.findElement(By.xpath("//a[text()='Transfer Funds']"));
        transferFounds.click();

        int random=(int)(Math.random()*6);
        WebElement fromAcount=driver.findElement(By.id("tf_fromAccountId"));
        Select selectfA=new Select(fromAcount);
        selectfA.selectByIndex(random);

        int random2=(int)(Math.random()*6);
        WebElement toAcount=driver.findElement(By.id("tf_fromAccountId"));
        Select selecttA=new Select(fromAcount);
        selecttA.selectByIndex(random2);

        WebElement amaunt= driver.findElement(By.id("tf_amount"));
        amaunt.sendKeys("10000");
        WebElement description= driver.findElement(By.id("tf_description"));
        description.sendKeys("Okul parası");

        WebElement contin=driver.findElement(By.id("btn_submit"));
        contin.click();

        Thread.sleep(2000);
        WebElement submit=driver.findElement(By.id("btn_submit"));
        submit.click();
        WebElement text=driver.findElement(By.cssSelector("div[class='alert alert-success']"));
        String gercek=text.getText();
        String benimBuldugum="You successfully submitted your transaction.";
        Assert.assertEquals("sonuçlar uyuşmuyor",benimBuldugum,gercek);

        Thread.sleep(2000);
        driver.quit();
    }

}
