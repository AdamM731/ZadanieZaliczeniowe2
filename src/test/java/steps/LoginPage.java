package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void SignIn(String email, String password) {
        WebElement Email  = driver.findElement(By.name("email"));
        Email.sendKeys(email);

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys(password);
        Password.submit();
    }
}
