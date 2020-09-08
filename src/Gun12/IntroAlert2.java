package Gun12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class IntroAlert2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickMe2.click();
        Thread.sleep(2000);

        driver.switchTo().alert().dismiss();//Alert kutucuğuna geçildi(switchTo),iptal butonuna basıldı
        Thread.sleep(2000);

        WebElement kontrolSonuc= driver.findElement(By.id("confirm-demo"));
        String benimki="You pressed Cancel!";
        Assert.assertEquals(benimki,kontrolSonuc.getText());


        Thread.sleep(2000);
        driver.quit();
    }


}

