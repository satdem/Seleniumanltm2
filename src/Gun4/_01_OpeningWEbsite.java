package Gun4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _01_OpeningWEbsite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        //konsola yazılan gereksiz bilgileri sessize alır(yazdırmıyor)

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAnlatim\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

       // WebElement e= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914887"));
        //System.out.println(e.getText());

        Thread.sleep(3000);
        driver.quit();


    }
}
