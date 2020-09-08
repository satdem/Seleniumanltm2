package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import utils.BaseStaticDriver;

import javax.swing.*;

public class _01_ActionClikTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement clikbutton= driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions builder=new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım

        Action build=builder.moveToElement(clikbutton).click().build();
       // Henüz işlem olmadı
        build.perform();
        //Aksiyon yapılıyor.
        
        Thread.sleep(6000);
        driver.quit();
    }
}
