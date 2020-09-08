package Mentoring.Burak4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class ornek1 extends BaseStaticDriver {
    public static <select> void main(String[] args) throws InterruptedException {
        driver.get("https://www.jotform.com/202422515857050");

        //ad ve soyad
        WebElement ad= driver.findElement(By.id("first_6"));
        ad.sendKeys("Sati");  //ad ve soyad
        WebElement soyad= driver.findElement(By.id("last_6"));
        soyad.sendKeys("Sati");
        if (ad.isDisplayed()){
            System.out.println("ad kutucuğu aktif");
        }

        //eposta
        driver.findElement(By.id("input_12")).sendKeys("sati@gmail.com");
        Thread.sleep(1000);


        //yas
        WebElement yas=driver.findElement(By.xpath("//input[@id='input_10']"));
        if (yas.isEnabled()){
            System.out.println("yaş kutusu mevcuttur");
        }
        driver.findElement(By.xpath("//input[@id='input_10']")).sendKeys("42");

        //hobileriniz
        Select hobi=new Select(driver.findElement(By.xpath("//select[@id='input_11']")));
        hobi.selectByVisibleText("Kitap okumak");
        Thread.sleep(1000);

        //kaç saat ders
        WebElement derssec= driver.findElement(By.id("input_14_0"));
        derssec.click();
        if (derssec.isSelected()){
            System.out.println("kac saat ders çalışıdığı seçıldi ");
        }

        //ders çalışma engelin ne
        driver.findElement(By.xpath("//input[@value='Tembelim']")).click();
        //puan verme
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("10");

        //buton
        driver.findElement(By.xpath("//button[@id='input_2']")).click();

        //tesekkur yazısı
        WebElement tesekkur=driver.findElement(By.xpath("//h1[text()='Teşekkürler!']"));
        if (tesekkur.isDisplayed()){
            System.out.println("teşekkürler yazısı görüldü");
        }


    }

}
