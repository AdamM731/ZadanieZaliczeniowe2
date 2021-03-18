package steps;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SearchProductProcess {


   WebDriver driver;

    public SearchProductProcess(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchProduct() {
        WebElement Search = driver.findElement(By.name("s"));
        Search.sendKeys("Hummingbird Printed Sweater");
        Search.submit();

        WebElement ProductButton = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a/img"));
        ProductButton.click();
    }

    public void SetProductDetails(String size, String amount) {
        WebElement SelectSize = driver.findElement(By.id("group_1"));
        SelectSize.sendKeys(size);

        WebElement SelectAmount = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
        SelectAmount.sendKeys(Keys.BACK_SPACE);
        SelectAmount.sendKeys(amount);
    }
}
