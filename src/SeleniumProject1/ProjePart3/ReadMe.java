package SeleniumProject1.ProjePart3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {
     /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */
     public static void main(String[] args) throws InterruptedException {
         driver.get(" https://www.snapdeal.com/");

         WebElement arama= driver.findElement(By.id("inputValEnter"));
         arama.sendKeys("teddy bear");


        WebElement search=driver.findElement(By.className("searchTextSpan"));
        search.click();
         Thread.sleep(2000);
/*

         WebElement goruntu= driver.findElement(By.cssSelector("id=searchMessageContainer>div>span"));
         String sgoruntu=goruntu.getText();

         Assert.assertTrue("", sgoruntu.contains("teddy bear"));

         driver.findElement(By.cssSelector("img[title=Snapdeal]")).click();

         String url=driver.getCurrentUrl();
         Assert.assertEquals("https://www.snapdeal.com/)",url);
*/

         String aramaTexti = driver.findElement(By.cssSelector("#searchMessageContainer > div > span")).getText();
         Assert.assertTrue("", aramaTexti.contains("teddy bear"));


         driver.findElement(By.cssSelector("img[title=Snapdeal]")).click();


         String beklenenURL = "https://www.snapdeal.com/";
         String currentURL = driver.getCurrentUrl();
         Assert.assertTrue("Current url Yanlis", currentURL.equals(beklenenURL));


         Thread.sleep(2000);
         driver.quit();

     }
}
