package Gun6.XPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _1_XPath extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/"); // siteyi açtım

        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");

        Thread.sleep(1000);
        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        Thread.sleep(1000);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        WebElement slb=driver.findElement(By.xpath(" //div[text()='Sauce Labs Backpack']"));
        slb.click();
        Thread.sleep(2000);

        WebElement addtoCart=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addtoCart.click();
        Thread.sleep(2000);

        WebElement buttonBack=driver.findElement(By.xpath("//button[text()='<- Back']"));
        buttonBack.click();
        Thread.sleep(2000);

        WebElement slbt=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        slbt.click();
        Thread.sleep(2000);

        WebElement addtoCart2=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addtoCart2.click();
        Thread.sleep(2000);

        WebElement contSepet=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        contSepet.click();
        Thread.sleep(2000);
        WebElement checkOut=driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
        checkOut.click();
        Thread.sleep(2000);

        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Sati");
        Thread.sleep(2000);

        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Demirci");
        Thread.sleep(2000);

        WebElement postacode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        postacode.sendKeys("47647");
        Thread.sleep(2000);

        WebElement contin=driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
        contin.click();
        Thread.sleep(2000);

        WebElement preis1=driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String spreis1=preis1.getText();
        WebElement preis2=driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String spreis2=preis2.getText();
        System.out.println("spreis1 = " + spreis1);
        System.out.println("spreis2 = " + spreis2);


        WebElement preis=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String spreis=preis.getText();
        System.out.println("spreis = " + spreis);

        double d1=stringTodouble(spreis1);
        double d2=stringTodouble(spreis2);
        double d=stringTodouble(spreis);

        System.out.println(d1+","+ d2+","+ d);
        Assert.assertTrue("sonuçlar tutmuyor",d==d1+d2);

        Thread.sleep(2000);
        driver.quit();
    }
    public static double stringTodouble(String spreis1){
        spreis1 =spreis1.replaceAll("[^0-9.]","");//"[^\\d.]" aynısı
        double dpreis1=Double.parseDouble(spreis1);
        return dpreis1;
    }

}
