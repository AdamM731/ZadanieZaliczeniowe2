package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShotCommend {

    WebDriver driver;

    public ScreenShotCommend(WebDriver driver){
        this.driver = driver;
    }
    public void takeSnapShot(){

        try {
            Thread.sleep(120);
            Robot r = new Robot();

            // It saves screenshot to desired path
            String path = "ScreenShots\\Screenshot1";

            // Used to get ScreenSize and capture image
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);

        }
    }

}
