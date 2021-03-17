package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShotCommend {

    WebDriver driver;

    public ScreenShotCommend(WebDriver driver){
        this.driver = driver;
    }

    public void ScreenShot() {
        WebElement ConfirmationScreenshot = driver.findElement(By.id("content"));
        ConfirmationScreenshot.getScreenshotAs()
    }

}
