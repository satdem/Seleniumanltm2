package Gun4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _4_FindingByClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz bilgileri sessize aldı.
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumAnlatim\\drivers\\chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://www.practiceselenium.com"); // siteyi açtım
        Thread.sleep(2000);
        WebElement e=driver.findElement(By.className("editor_collections"));
        System.out.println(e.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
