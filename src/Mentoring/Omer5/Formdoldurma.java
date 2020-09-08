package Mentoring.Omer5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

public class Formdoldurma extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://form.jotform.com/202468401801346");

        JavascriptExecutor js =(JavascriptExecutor) driver;

//      isim
        WebElement Ad= driver.findElement(By.cssSelector("input[id='first_4']"));
        Ad.sendKeys("ömer");

        //soyisim
        WebElement soyad= driver.findElement(By.cssSelector("input[id='last_4']"));
        soyad.sendKeys("özdemir");




        WebElement element = driver.findElement(By.cssSelector("select#input_14"));


        Select slc = new Select(element);
        slc.selectByVisibleText(" Hukuk Fakültesi ");



        element=driver.findElement(By.xpath("//select[@id='input_20']"));
        slc = new Select(element);
        slc.selectByIndex(3);


        driver.findElement(By.cssSelector("#input_12_area")).sendKeys("+49");
        driver.findElement(By.cssSelector("#input_12_phone")).sendKeys("17661792412");



        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("omer@gmail.com");

        driver.findElement(By.xpath("//input[@id='input_3_addr_line1']")).sendKeys("Yildirim Sk.");

        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("//input[@id='input_3_addr_line1']")).sendKeys("Yildirim Sk.");


        driver.findElement(By.cssSelector("#input_3_addr_line2")).sendKeys("westpark");
        driver.findElement(By.cssSelector("#input_3_city")).sendKeys("duseldorf");
        driver.findElement(By.cssSelector("#input_3_state")).sendKeys("krefeld");
        driver.findElement(By.cssSelector("#input_3_postal")).sendKeys("47799");

        element=driver.findElement(By.cssSelector("#input_3_country"));
        slc=new Select(element);
        slc.selectByValue("Germany");

        js.executeScript("window.scrollBy(0,600)");

        element = driver.findElement(By.cssSelector("#input_11"));

        slc=new Select(element);

        //todo    Select tag 'inin içerisindeki options lara ulaşmak için -- >>    getOptions();
        List<WebElement> burs=slc.getOptions();
        //todo     Kaç adet options varsa, int option Sayisina eşitlendi.
        int optionSayisi = burs.size();
        int random = (int)((Math.random()*optionSayisi)+1);
        slc.selectByIndex(random);



        element=driver.findElement(By.cssSelector("#input_19"));
        slc=new Select(element);
        slc.selectByValue("10");
        //nereden duydunuz
        element=driver.findElement(By.cssSelector("#input_21"));
        slc=new Select(element);
        slc.selectByValue("Internet");

        //kabulediyotumbutonu
        driver.findElement(By.cssSelector("input#input_22_0")).click();
        //submitbutonu
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();


        // WebElement text=driver.findElement()

        WebElement sonuc=driver.findElement(By.xpath("//p[text()='Your submission has been received.']"));

        Assert.assertEquals("Your submission has been received.",sonuc.getText());

        Thread.sleep(1000);
        driver.quit();

    }
}
