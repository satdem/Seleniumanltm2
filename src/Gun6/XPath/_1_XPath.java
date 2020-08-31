package Gun6.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _1_XPath extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/"); // siteyi açtım

        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");

        Thread.sleep(1000);
        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        Thread.sleep(1000);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        WebElement slb=driver.findElement(By.xpath(" //div[text()='Sauce Labs Backpack']"));
        slb.click();
        Thread.sleep(2000);

        WebElement addtoCart=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addtoCart.click();
        Thread.sleep(2000);

        WebElement buttonBack=driver.findElement(By.xpath("//button[text()='<- Back']"));
        buttonBack.click();
        Thread.sleep(2000);

        WebElement slbt=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        slbt.click();
        Thread.sleep(2000);

        WebElement addtoCart2=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addtoCart2.click();
        Thread.sleep(2000);

        WebElement contSepet=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        contSepet.click();

        Thread.sleep(2000);
        driver.quit();
    }

}