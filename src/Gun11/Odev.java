package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class Odev extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> sehirler= driver.findElements(By.cssSelector("div[id=answerDiv]>div"));
        List<WebElement> ulkeler= driver.findElements(By.cssSelector("div.destinationBox"));
        for (WebElement s:sehirler) {
            for (WebElement u:ulkeler) {
                Actions builder=new Actions(driver);
                if(u.getCssValue("background").equals("green")) {
                    Action build = builder.dragAndDrop(s, u).build();
                    build.perform();

                }
            }

        }

    }
}
