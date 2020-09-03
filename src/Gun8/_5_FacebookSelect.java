package Gun8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _5_FacebookSelect extends BaseStaticDriver {
    /*
   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.
*/
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

       WebElement yenihesapolustur= driver.findElement(By.cssSelector("a[id^=u_][id$='2']"));
       yenihesapolustur.click();
        Thread.sleep(2000);

        WebElement name=driver.findElement(By.cssSelector("input[id^='u'][id$='b']"));
        Thread.sleep(1000);
        name.sendKeys("Sati");

        WebElement lastname=driver.findElement(By.cssSelector("input[id$='_d'][id^='u_']"));
        Thread.sleep(1000);
        lastname.sendKeys("Demirci");
        WebElement tel=driver.findElement(By.cssSelector("input[id$='_g'][id^='u_']"));
        Thread.sleep(1000);
        tel.sendKeys("017545454888");
        WebElement yenisifre=driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-'][name=\"reg_passwd__\"]"));
        yenisifre.sendKeys("sd75780709");

        WebElement guntik=driver.findElement(By.cssSelector("select[id='day']"));
        Select gun=new Select(guntik);
        gun.selectByVisibleText("18");
        WebElement aytik=driver.findElement(By.cssSelector("select[id='month']"));
        Select ay=new Select(aytik);
        ay.selectByVisibleText("Tem");
        WebElement yiltik=driver.findElement(By.cssSelector("select[id='year']"));
        Select yil=new Select(yiltik);
        yil.selectByVisibleText("1978");

        WebElement cinsiyet= driver.findElement(By.cssSelector("span[class='_5k_2 _5dba']>input[name='sex'][id$='4']"));
        cinsiyet.click();
        WebElement kaydol= driver.findElement(By.cssSelector("button[id^='u_'][id$='s']"));
        kaydol.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
