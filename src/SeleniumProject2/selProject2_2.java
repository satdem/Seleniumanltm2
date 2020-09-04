package SeleniumProject2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class selProject2_2 extends BaseStaticDriver {
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

        int random=(int)(Math.random()*4);
        WebElement payeeDropdown=driver.findElement(By.id("sp_payee"));
        Select selectpD=new Select(payeeDropdown);
        selectpD.selectByIndex(random);

        Thread.sleep(1000);
        int random2=(int)(Math.random()*6);
        WebElement acountDropdown=driver.findElement(By.id("sp_account"));
        Select selectaD=new Select(acountDropdown);
        selectaD.selectByIndex(random2);

        WebElement amaunt= driver.findElement(By.id("sp_amount"));
        amaunt.sendKeys("5000");

        WebElement date= driver.findElement(By.id("sp_date"));
        date.click();
        WebElement gunTarih=driver.findElement(By.xpath("//a[text()='11']"));
        gunTarih.click();

        WebElement description= driver.findElement(By.id("sp_description"));
        description.sendKeys("Okul parası");

        Thread.sleep(1000);
        WebElement pay=driver.findElement(By.id("pay_saved_payees"));
        pay.click();
        WebElement text=driver.findElement(By.cssSelector("div[id='alert_content']"));
        String gercek=text.getText();
        String benimBuldugum="The payment was successfully submitted.";
        Assert.assertEquals("sonuçlar uyuşmuyor",benimBuldugum,gercek);

        Thread.sleep(2000);
        driver.quit();

    }
}
