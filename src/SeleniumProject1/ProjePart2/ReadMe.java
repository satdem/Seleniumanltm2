package SeleniumProject1.ProjePart2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {
    /*
       1) Bu siteye gidin. -> https://demo.applitools.com/

       2) Username kısmına "ttechno@gmail.com" girin.

       3) Password kısmına "techno123." girin.

       4) "Sign in" buttonunan tıklayınız.

       5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

       6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
    */
    public static void main(String[] args) throws InterruptedException {
        driver.get(" https://demo.applitools.com/");

        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("ttechno@gmail.com");

        Thread.sleep(2000);

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("techno123.");
        Thread.sleep(2000);


        WebElement buton= driver.findElement(By.id("log-in"));
        buton.click();

        WebElement son= driver.findElement(By.id("time"));
        String sson=son.getText();
        Assert.assertEquals("Your nearest branch closes in: 30m 5s",sson);

        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://demo.applitools.com/app.html",url);


        Thread.sleep(2000);
        driver.quit();
    }
}
