package Gun12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickMe3.click();
        Thread.sleep(2000);

        driver.switchTo().alert().sendKeys("Sati");//Alert kutucuğuna geçildi(switchTo),iptal butonuna basıldı
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//Alert kutucuğuna geçildi(switchTo),tamam butonuna basıldı


        WebElement kontrolSonuc= driver.findElement(By.id("prompt-demo"));
        String benimki="You have entered 'Sati' !";
        Assert.assertEquals(benimki,kontrolSonuc.getText());
       //ya da bu şekilde de test edebilirim
        Assert.assertTrue(kontrolSonuc.getText().contains("Sati"));

        Thread.sleep(2000);
        driver.quit();
    }
}
