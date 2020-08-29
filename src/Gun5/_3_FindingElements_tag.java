package Gun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class _3_FindingElements_tag extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com");

        List<WebElement> liste=driver.findElements(By.tagName("li"));
        for (WebElement e:liste) {
            System.out.println(e.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
