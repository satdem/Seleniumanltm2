package Gun8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _3_selectClassgiris  extends BaseStaticDriver {
    /*
            select  class ı
            görünen text ile seçim:  selectByVisibleText
            value si ile seçim    :  selectByValue
            indexi ile seçim      :  selectByIndex

            seçim yaptırılabilir.

            WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

            Select menu = new Select(dropDownMenu);

            menu.selectByVisibleText("Automotive");
            menu.selectByValue("search-alias=automotive-intl-ship");
            menu.selectByIndex(2);
     */
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.amazon.com/");

        WebElement menuDropDown= driver.findElement(By.id("searchDropdownBox"));
        Select menu= new Select(menuDropDown);
        menu.selectByVisibleText("Books");
        WebElement ara= driver.findElement(By.id("nav-search-submit-text"));
        ara.click();

        Thread.sleep(6000);
        driver.quit();
    }
}
