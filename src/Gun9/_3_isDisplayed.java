package Gun9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _3_isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        //yeni hesap butonuna tıklattım
        WebElement yenihesapolustur= driver.findElement(By.cssSelector("a[id^=u_][id$='2']"));
        yenihesapolustur.click();
        Thread.sleep(3000);


        WebElement email=driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));

        WebElement tEmail=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));

        System.out.println(tEmail.isDisplayed());//burada aktif değil
        email.sendKeys("ismet@hotmail.com");
        System.out.println(tEmail.isDisplayed());//burada aktif oluyor

        tEmail.sendKeys("ismet@hotmail.com");
        
        Thread.sleep(2000);
        driver.quit();
    }


}
