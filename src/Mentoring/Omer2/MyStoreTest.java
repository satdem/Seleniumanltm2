package Mentoring.Omer2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStoreTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAnlatim\\drivers\\chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver=new ChromeDriver();// çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://tutorialsninja.com/demo/index.php?route=product/search");// siteyi açtım

        driver.manage().window().maximize();

        WebElement search= driver.findElement(By.cssSelector("input[name=search]"));
        search.sendKeys("Iphone");

        WebElement searchbutton= driver.findElement(By.cssSelector(".btn-default.btn-lg"));//. class için
        searchbutton.click();

        /* todo   ID
        button[id=list-view]
        button#list-view
        .fa.fa-th-list
         */

        WebElement listelement=driver.findElement(By.cssSelector("button#list-view"));//#id için kullanılıyor
        listelement.click();

        /* todo
        *   *işareti içinde olan bulunduran demektir
         button[onclick*=cart

         */
        driver.findElement(By.cssSelector("button[onclick*=cart")).click();

        /*todo start with(başlayanı bul)
        *  button[onclick^='w'] w ile başlayan demek
        * */
        Thread.sleep(2000);
        WebElement alert= driver.findElement(By.cssSelector("div.alert"));
        //textin yazı halini görmek istedik
       // System.out.println(alert.getText());

        //benim istediğim sonuç
        String myAlert="Success: You have added iPhone to your shopping cart!";
        Assert.assertTrue("ürün eklenirken sorun oluştu",alert.getText().contains(myAlert));

        System.out.println("Ürün başarı ile karta eklenmiştir");
        /*
        nth of type
     ilkii bulmak için:     class ismi button-group olan div in içerisindeki, 1. buttonu ver  -------     div.button-group>button:first-of-type
     sonuncuyu bulmak için: div.button-group>button:last-of-type
     ortadakini veya herhngi bir tanesini bulmak için : div.button-group>button:nth-of-type(2)


     google arama kısmı için

     ul.erkvQe>li:nth-of-type(2)
         */


        driver.findElement(By.cssSelector("span#cart-total")).click();

        Thread.sleep(1000);


        WebElement totalPrice = driver.findElement(By.cssSelector(".table-bordered>tbody>:last-of-type>:last-of-type"));

        System.out.println(totalPrice.getText());


        Assert.assertEquals("$123.20",totalPrice.getText());

        System.out.println("Fiyat carta işlenmiştir..");
    }
}
