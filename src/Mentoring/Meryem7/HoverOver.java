package Mentoring.Meryem7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class HoverOver extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://birtwhistle.com/workers-compensation-insurance//%22");

        WebElement personalInsurance= driver.findElement(By.id("menu-item-19"));
        Actions action=new Actions(driver);
        action.moveToElement(personalInsurance).perform();//maus üstüne geldi mi açılan bölüm,
        // buşekilde yazımda build e gerek yok

        Thread.sleep(2000);
        WebElement bussines= driver.findElement(By.xpath("//span[text()='Business Insurance']"));

        action.moveToElement(bussines).perform();
    }
}
