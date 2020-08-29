package SeleniumProject1.ProjePart1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {
    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demoqa.com/text-box");
        Thread.sleep(3000);

        WebElement fullname= driver.findElement(By.id("userName"));
        fullname.sendKeys("Automation");
        Thread.sleep(3000);



        WebElement email= driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");
        Thread.sleep(3000);


        WebElement caddress= driver.findElement(By.id("currentAddress"));
        caddress.sendKeys("Testing Current Address");
        Thread.sleep(3000);


        WebElement paddress= driver.findElement(By.id("permanentAddress"));
        paddress.sendKeys("Testing Permanent Address");

        WebElement buton= driver.findElement(By.id("submit"));
        buton.sendKeys(Keys.ENTER);

       String sFullname=driver.findElement(By.cssSelector("#name")).getText();
       Assert.assertTrue(sFullname.contains("Automation"));

        String semail=driver.findElement(By.cssSelector("#email")).getText();
        Assert.assertTrue(semail.contains("Testing"));


        Thread.sleep(3000);
        driver.quit();

    }
}
