package Gun5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
import org.junit.Assert.*;

public class _1_sendKeys_Click extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com");
        WebElement link= driver.findElement(By.linkText("Check Out"));
        link.click();//tıklatma

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("info@tecno.study");//text gönderme

        WebElement name= driver.findElement(By.id("name"));
        name.sendKeys("SATI");//text gönderdik

        WebElement adress= driver.findElement(By.id("address"));
        adress.sendKeys("ben de buradayim");//text gönder

        WebElement button= driver.findElement(By.className("btn-primary"));
        button.click();//tıkladık

        WebElement menu= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuText=menu.getText();

        Assert.assertEquals("Menu",menuText);

        String url=driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?",url);

        Thread.sleep(3000);
        driver.quit();
    }
}
