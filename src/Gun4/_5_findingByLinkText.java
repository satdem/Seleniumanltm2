package Gun4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _5_findingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com"); // siteyi açtım
        WebElement e=driver.findElement(By.linkText("Check Out"));
        System.out.println(e.getAttribute("data-title"));

        Thread.sleep(3000);
        driver.quit();

    }
}