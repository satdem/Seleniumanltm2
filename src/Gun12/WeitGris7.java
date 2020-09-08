package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.concurrent.TimeUnit;

public class WeitGris7 extends BaseStaticDriver {
    /*
      Selenium Bekletme Konusu:
      Thread.sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

       Implicit wait :
       Tüm sayfadaki elemanalr için bir keleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
       Bütüm elemanlar geçerli.NoSuchElement hatası nı vermek için verilen süre kadar  eleman bulunana kadar bekler.

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES)

       pageLoadTimeout :
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
       30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
       driver.get() de  driver.navigate.To
 */

    public static void main(String[] args) throws InterruptedException {

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//bu ise eleman gözükene kadar bekliyor.
                           //bir kez yazılması her eleman için geçerl oluyor.
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement click= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        click.click();

       // Thread.sleep(30000);//bu gereksiz bekleme yapıyor,vakit kaybı

        WebElement webdriverText= driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println(webdriverText.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
