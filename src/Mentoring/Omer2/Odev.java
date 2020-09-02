package Mentoring.Omer2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Odev extends BaseStaticDriver {
 /*
Ödev:
            https://demoqa.com/automation-practice-form   bu siteye gidin.
todo        SADECE aşağıda bahsedilen kısımları doldurunuz !
1.  Name
2.    LastName
3.      Email
4.      Gender:
5.      Hobbies
6.      Current adress
7.      submit butona tıkla
8.      Ekrandaki mesajı dogrula
9.      2 Saniye bekledikten sonra close butonuna bas
10.   2 saniye bekleyip sistemi kapat.

            name,id, classname ve kendinizi geliştirmek için daha çok CSS SELECTOR ile aramalar yapın.


            Buraları kendinize göre doldurun.
            Submit butonuna bastırın.

             yeni bir bilgi çerçevesi açılacaktır.
             Bilgi çerçevesinin başlığının ekranda gözüküp gözükmediğini check edin. (Eğer gözüktüyse formda zorunlu olan kısımları doldurmuşsunuz demektir,yani sorun yok demektir.)

             Bilgi mesajı : Thanks for submitting the form
            Onu görünce de close butonuna bastırın ve bekleyip sistemi tamamen kapatın.

            Test başarıyla tamamlandıysa konsolda "Formu doldurdugunuz için teşekkür ederiz..." mesajı yazsın.

            todo   NOT: CSS SELECTOR ile arama yaparken input, button, label gibi tag leri de iyi inceleyin.
            Bu test ısınma içindir. CSS selector pazartesi günü daha detaylı görülecektir.

 */
 public static void main(String[] args) throws InterruptedException {
     driver.get("https://demoqa.com/automation-practice-form");
     driver.manage().window().maximize();
     WebElement name= driver.findElement(By.cssSelector("input#firstName"));
     name.sendKeys("Sati");
     Thread.sleep(2000);

     WebElement lastname= driver.findElement(By.cssSelector("input#lastName"));
     lastname.sendKeys("Demirci");
     Thread.sleep(2000);
     WebElement email= driver.findElement(By.cssSelector("input#userEmail"));
     email.sendKeys("sdemirci@gmail.com");
     Thread.sleep(2000);

     WebElement gender= driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
     gender.click();
     Thread.sleep(2000);

     driver.findElement(By.cssSelector("#userNumber")).sendKeys("0535123123");
     Thread.sleep(2000);

     WebElement hobbies= driver.findElement(By.cssSelector("label[for=hobbies-checkbox-3]"));
     hobbies.click();
     Thread.sleep(2000);

     WebElement currentadress= driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
     currentadress.sendKeys("kerken");
     Thread.sleep(2000);

     WebElement submitbutton= driver.findElement(By.cssSelector("button[id=submit]"));
     submitbutton.click();
     Thread.sleep(2000);

     WebElement mesaj = driver.findElement(By.cssSelector(".modal-title"));

     String beklenen="Thanks for submitting the form";
     Assert.assertEquals(beklenen,mesaj.getText());

     System.out.println("formu doldurduğunuz için teşkkürler");
     WebElement close=driver.findElement(By.className("div>button#closeLargeModal"));
     Thread.sleep(2000);
     close.click();

     driver.quit();
 }
}
