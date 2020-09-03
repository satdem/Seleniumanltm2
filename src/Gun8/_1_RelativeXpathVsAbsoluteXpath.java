package Gun8;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class _1_RelativeXpathVsAbsoluteXpath extends BaseStaticDriver {
    /*
           interviewlarda kaç çeşit xpath vardır şeklinde soru gelebilir.

           Relative Xpath denir.
           //input[@id='user-name']
           1- // başlıyor.
           2- Elemanı direk bulur, baştan itibaren diğer elemanlara bağlı kalmaz.


          Absolute Xpath deniyor.
          /html/body/div[2]/div/div/div/form/input
          1- / başlıyor.
          2- En baştan HTML den başlyarak bir yol bulur.Araya başka eleman girdiğind eyol kaybolur.
             Bu yüzden kullanışsızdır.
     */
    static void Login() throws InterruptedException {
        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Login();
        List<WebElement> urunlerclik=driver.findElements(By.xpath("//button [@class=\"btn_primary btn_inventory\"]"));
        for (WebElement e:urunlerclik) {
            e.click();
        }
        List<String> surunler=new ArrayList<>();
        List<WebElement> urunler=driver.findElements(By.cssSelector("div[class=inventory_item_name]"));

        for (WebElement s:urunler) {
            surunler.add(s.getText());
        }
        Thread.sleep(1000);
        WebElement contSepet=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        Thread.sleep(1000);
        contSepet.click();

        List<WebElement> sepeturunleri=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        List<String> ssurunler=new ArrayList<>();
        for (WebElement ss:sepeturunleri) {
            ssurunler.add(ss.getText());
        }
        Thread.sleep(1000);

        for (int i = 0; i < ssurunler.size(); i++) {
            if(!surunler.get(i).equals(ssurunler.get(i))) {
                Assert.fail("urunler uyuşmuyor= "+ ssurunler.get(i)+" "+ surunler.get(i));
                //fail direk hata oluştur demek
               // Assert.assertEquals("urunler uuşmuyor",ssurunler.get(i),surunler.get(i));
                //bu da 2. yol
            }
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
