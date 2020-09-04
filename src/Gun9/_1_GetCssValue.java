package Gun9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _1_GetCssValue extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.snapdeal.com/");
        // tag in içdeki keylerin değerlerini almamızı sağlar

        WebElement btn= driver.findElement(By.id("inputValEnter"));
        System.out.println(btn.getAttribute("name"));
        System.out.println(btn.getAttribute("type"));
        System.out.println(btn.getAttribute("class"));

        System.out.println("-----------------------------------------");
        // Elemeanın CSS yani ekran gözüken tüm özelliklerini; font renk vs ulaşmamızı sağlar
        WebElement btnara= driver.findElement(By.className("searchformButton"));
        System.out.println(btnara.getCssValue("color"));
        System.out.println(btnara.getCssValue("font-size"));
        System.out.println(btnara.getCssValue("background"));

        Thread.sleep(2000);
        driver.quit();
    }

}
