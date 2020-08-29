package Gun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _2_Navigating extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com");

        WebElement link= driver.findElement(By.linkText("Check Out"));
        link.click();//tıklatma

        Thread.sleep(3000);
        driver.navigate().back();//sayfada geri gitme

        Thread.sleep(3000);
        driver.navigate().forward();//sayfada ileri gitme

        driver.manage().window().maximize();//ekranı büyütüyor

        Thread.sleep(3000);
        driver.quit();

    }
}
