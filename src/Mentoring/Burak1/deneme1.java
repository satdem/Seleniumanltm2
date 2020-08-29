package Mentoring.Burak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deneme1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAnlatim\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.manage().window().maximize();

        driver.findElement(By.id("email_create")).sendKeys("burasgfdgraaak@burak.com");

        driver.findElement(By.id("SubmitCreate")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Burak");

        driver.findElement(By.id("customer_lastname")).sendKeys("Türkmen");

        driver.findElement(By.id("passwd")).sendKeys("brktrkmn");

        //Thread.sleep(2000);

        Select days = new Select(driver.findElement(By.id("days")));

        days.selectByValue("9");

        Select months = new Select(driver.findElement(By.id("months")));

        months.selectByValue("12");

        Select years = new Select(driver.findElement(By.id("years")));

        years.selectByValue("1996");

        //Thread.sleep(2000);

        driver.findElement(By.id("company")).sendKeys("Techno Study");

        driver.findElement(By.id("address1")).sendKeys("Landberg Street. 12 ");

        driver.findElement(By.id("address2")).sendKeys("NYC 4587");

        driver.findElement(By.id("city")).sendKeys("New York City");

        Select city = new Select(driver.findElement(By.id("id_state")));

        city.selectByValue("32");

        driver.findElement(By.id("postcode")).sendKeys("10006");

        driver.findElement(By.id("other")).sendKeys("Stay Home");

        driver.findElement(By.id("phone")).sendKeys("13413413413413413");

        driver.findElement(By.id("phone_mobile")).sendKeys("25314532122");

        driver.findElement(By.id("submitAccount")).click();


    }

}
