package Mentoring.Tahir3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class cssWorking extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://developer.salesforce.com/signup");

        WebElement baslangıc= driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        baslangıc.click();
        Thread.sleep(2000);
        WebElement postacode= driver.findElement(By.cssSelector("input[name*='[p']"));//input[name$='code]']
        postacode.sendKeys("47647");
        Thread.sleep(2000);
        driver.quit();
    }
}
