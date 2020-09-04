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

        WebElement name=driver.findElement(By.cssSelector("input[id^='u'][id$='b']"));// ya da   [name='firstname']
        Thread.sleep(1000);                                   //input[type='text'][name='firstname'][id^='u_'][id$='_b']

        name.sendKeys("Sati");

        WebElement lastname=driver.findElement(By.cssSelector("input[id$='_d'][id^='u_']"));
        Thread.sleep(1000);
        lastname.sendKeys("Demirci");
       /* WebElement tel=driver.findElement(By.cssSelector("input[id$='_g'][id^='u_']"));
        Thread.sleep(1000);// tel kullanirsam burası geçerli
        tel.sendKeys("017545454888");*/

        WebElement email=driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        email.sendKeys("ismet@hotmail.com");


        WebElement tEmail=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        tEmail.sendKeys("ismet@hotmail.com");

        WebElement yenisifre=driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-'][name=\"reg_passwd__\"]"));
        yenisifre.sendKeys("sd75780709");//ya da By.id("password_step_input");

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
        cinsiyet.click();                                     //span[id^='u_'][id$='_o']>:nth-child(2)

        WebElement kaydol= driver.findElement(By.cssSelector("button[id^='u_'][id$='s']"));
        kaydol.click();

        Thread.sleep(2000);
        driver.quit();
    }
    /*u_1_2
u_2_2
u_3_2
u_4_2
u_6_2

u_ başlıyor
_2 bitiyor

a[id^='u_'][id$='_2']

CSS de
^ -> ile başlayan
$ -> ile biten
* -> içinde geçen
driver.findElement(By.cssSelector("div#reg_form_box>div>div>div>div>input")) bu sekilde alt elemanlara gidiliyor

1
[19:35]

Xpath
//a[starts-with(@id,'u_')] -> ile başlayan
//a[ends-with(@id,'_2')]    -> ile biten
//a[contains(@id,'u_')]    -> içinde geçen
() -->>   alip  [3]  ->3. sıradakine ulaşıyorum
(//a[starts-with(@id,'u_')])[3]  gibi
*/
}
