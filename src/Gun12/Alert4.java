package Gun12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Alert4 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement text= driver.findElement(By.cssSelector("input[type='text']"));
        text.sendKeys("123");

        WebElement submit= driver.findElement(By.cssSelector("[type='submit']"));
        submit.click();
        Thread.sleep(2000);

       String alertMesaj=driver.switchTo().alert().getText();
        System.out.println(alertMesaj);

        driver.switchTo().alert().accept();//1. alert için
        driver.switchTo().alert().accept();//2. alert için
        Thread.sleep(2000);
        driver.quit();
    }
}
