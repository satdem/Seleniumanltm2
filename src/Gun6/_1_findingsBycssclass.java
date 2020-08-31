package Gun6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
2- Business i çekleyin.
3- discover XYZ ye tıklatın ve online Advertising i seçin
4- Every day i seçin
5- Good u seçin
6- using XYZ yi tıklatın ve 3.seçeneği seçin*/

public class _1_findingsBycssclass extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement business= driver.findElement(By.cssSelector("input#u_Hc4_4586_0"));
        Thread.sleep(2000);                                //input[id$='4586_0']
        business.click();

        WebElement discover= driver.findElement(By.cssSelector("select#u_Hc4_4588"));
        discover.click();                                      ////input[id$='_4588']  ile biten
        Thread.sleep(2000);

        WebElement advertising=driver.findElement(By.cssSelector("select#u_Hc4_4588>*:nth-last-child(3)"));
                                                                 //"option[value='Online Advertising']" da olur
        advertising.click();
        Thread.sleep(2000);

        WebElement every=driver.findElement(By.cssSelector("input#u_Hc4_89585_0"));
                                                          //"input[value='Every Day']
        every.click();
        Thread.sleep(2000);

        WebElement good=driver.findElement(By.cssSelector("input[value='Good']"));
        good.click();
        Thread.sleep(2000);

        WebElement Usingxyz=driver.findElement(By.cssSelector("select#u_Hc4_4597"));
        Usingxyz.click();
        Thread.sleep(2000);

        WebElement using3=driver.findElement(By.cssSelector("select#u_Hc4_4597>:nth-child(4)"));
        using3.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
