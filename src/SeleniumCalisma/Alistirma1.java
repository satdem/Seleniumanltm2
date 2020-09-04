package SeleniumCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Alistirma1 extends BaseStaticDriver {
    /*1.  http://tutorialsninja.com/demo/index.php?route=common/home  adresine gidin
2.  Ana sayfada asagidakileri kontrol ediniz
    a.  Search text var mi kontrol edin
    b.  Search button var mi kontrol edin
    c.  item butonunun class'inin adi ve zemin rengini bulup consola yazdirin
    d.  Ana menu nün class'inin adini ve zemin rengini bulup consola yazdirin
    e.  Desktops menüsü altindaki Mac linkinin href attributunu consola yazdirin
3.  Asagidaki islemleri yaptirin
    a.  "Mac" kelimesini arama box'una yazdirin
    b.  Search butonuna tiklatin
    c.  Sonuclarin geldigi sayfadaki ürünleri fiyatina göre büyükten kücüge siralayin
    c.  Siralanan sonuclardan "MacBook Pro" ürününün aciklamasini ve fiyatini consola yazdirin
    d.  Bu sayfada isimleri "MacBook Pro" ve "iMac" olan ürünüleri sepete ekleyin
    e.  Sepete gidin
    f.  ürün sayisini kontrol edin
    g.  "iMac" in Quantity sini 2 yaparak yanindaki update butonuna tiklayin
    h.  Tüm ürünler icin ödemeniz gereken toplam fiyati consola yazdirin.
    i.  Tüm ürünleri silin.
    j.  "Your Store" linkine tiklayip ana sayfaya dönün*/
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().deleteAllCookies();
        WebElement search= driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        /*if (!search.getText().isEmpty())
        System.out.println(search.getText());

        else{
            System.out.println("search elementinin text i yok");
        }*/
        System.out.println(search.getAttribute("button"));
        System.out.println(search.getAttribute("text"));
        System.out.println(search.getAttribute("class"));
        System.out.println(search.getCssValue("background-color"));

        WebElement item= driver.findElement(By.id("cart-total"));
        System.out.println(item.getAttribute("class"));
        System.out.println(item.getCssValue("background-color"));
        System.out.println(item.getCssValue("color"));

        WebElement anameu= driver.findElement(By.cssSelector("div[class='collapse navbar-collapse navbar-ex1-collapse']"));
        System.out.println(anameu.getAttribute("class"));
        System.out.println(anameu.getCssValue("background-color"));
        System.out.println(anameu.getCssValue("color"));

        WebElement desktop= driver.findElement(By.xpath("(//a[contains(text(),'Mac')])[1]"));
        System.out.println(desktop.getAttribute("class"));
        System.out.println(desktop.getAttribute("href"));
        System.out.println(desktop.getCssValue("font-size"));

        WebElement aratext=driver.findElement(By.cssSelector("input[name='search']"));
        aratext.sendKeys("mac");
        search.click();

        WebElement select=driver.findElement(By.cssSelector("select[id='input-sort'"));
        Select select1=new Select(select);
        select1.selectByVisibleText("Price (High > Low)");

        WebElement macBookPro=driver.findElement(By.xpath("(//div[@class='caption'])[1]"));
        System.out.println("mac açıklama ve fiyat:"+macBookPro.getText());

        WebElement macBookProacıklam=driver.findElement(By.xpath("(//div[@class='caption'])[1]/p"));
        System.out.println("mac açıklama:"+macBookProacıklam.getText());
       // WebElement macBookProfiyat=driver.findElement(By.xpath("((//p[@class='price'])[1]"));
       // System.out.println("mac fiyat:"+macBookProfiyat.getText());

        Thread.sleep(2000);
        driver.quit();
    }


}
