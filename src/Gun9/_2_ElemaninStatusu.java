package Gun9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _2_ElemaninStatusu extends BaseStaticDriver {
    /*boolean isSelected();   checkbox, radiobutton
boolean isEnabled();
boolean isDisplayed();

isEnabled//(aktif olan, kullanılabilen koyu renkli seçenekler) yani kullanılabiliyor mu
Monday -> true
Sunday -> false

isSelected();//tıklı olan seçilmiş yani seçilmiş mi
Tuesday -> true
Thursday -> false


isDisplayed(); //görünüyor mu
Monday -> true
Sunday -> true
*/
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        Thread.sleep(1000);

        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected());

        sali.click();
        Thread.sleep(3000);
        System.out.println(sali.isSelected());
        System.out.println("-----------------");
        WebElement pazar= driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println(pazar.isDisplayed());
        System.out.println(pazar.isEnabled());
        System.out.println(pazar.isSelected());


        Thread.sleep(2000);
        driver.quit();
    }
}
