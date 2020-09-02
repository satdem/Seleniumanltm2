package Gun7;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Odevsenaryo3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Login();
        List<WebElement> urunler=driver.findElements(By.xpath("//button [@class=\"btn_primary btn_inventory\"]"));
        for (WebElement e:urunler) {
            e.click();
        }

        WebElement contSepet=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        contSepet.click();
        List<WebElement> urunsilme=driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));
        for (WebElement e:urunsilme) {
            e.click();
        }

    WebElement sepetkontrol= driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
    String sepettext=sepetkontrol.getText();
    Assert.assertTrue("sepet boş değil", sepettext.isEmpty());

    driver.quit();
    }
    static void Login() throws InterruptedException {
        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

    }

}
