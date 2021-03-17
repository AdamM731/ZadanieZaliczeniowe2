package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutProcess {

    WebDriver driver;

    public CheckOutProcess(WebDriver driver) {
        this.driver = driver;
    }

    public void CheckOutSteps() {
        WebElement AddToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        AddToCartButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"))).click();
        WebElement ProceedToCheckoutButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        ProceedToCheckoutButton.click();
        WebElement AddressRadioButton = driver.findElement(By.xpath("//*[@id=\"id-address-delivery-address-10122\"]/header/label/span[1]/span"));
        AddressRadioButton.click();
        WebElement ChoseShippingAddress = driver.findElement(By.name("confirm-addresses"));
        ChoseShippingAddress.click();
    }

    public void SelectMethodOfReceipt() {
        WebElement ReceiptRadioButton = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span/span"));
        ReceiptRadioButton.click();
        WebElement ShippingConfirmationButton = driver.findElement(By.name("confirmDeliveryOption"));
        ShippingConfirmationButton.click();

    }

    public void PaymentDetailsSteps() {
        WebElement PaymentRadioButton = driver.findElement(By.id("payment-option-1"));
        PaymentRadioButton.click();
        WebElement TermsOfServiceRadioButton = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        TermsOfServiceRadioButton.click();
        WebElement PaymentConfirmationButton = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        PaymentConfirmationButton.click();
    }

}
