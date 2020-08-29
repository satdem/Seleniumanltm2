package Gun4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _3_findingByidNotFoundException {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz bilgileri sessize aldı.

        System.setProperty("webdriver.chrome.driver","C:\\SeleniumAnlatim\\drivers\\chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.

        WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://www.practiceselenium.com"); // siteyi açtım

        try {
            WebElement e = driver.findElement(By.id("bulamadığımda ne olacak"));
            System.out.println(e.getText());
        }
        catch (Exception ex){
            System.out.println("eleman bulunamadı: "+ex.getMessage());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
