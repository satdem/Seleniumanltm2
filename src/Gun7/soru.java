package Gun7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class soru extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        List<WebElement> liste=driver.findElements(By.className("inventory_item_name"));
        for (WebElement e:liste) {
            System.out.println(e.getText());
        }

        /* List<WebElement> urunler=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for(WebElement urun: urunler)
        {
            System.out.println(urun.getText());
        } ya da bu şekilde*/

        Thread.sleep(2000);
        driver.quit();
    }
}
