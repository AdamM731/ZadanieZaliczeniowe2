package test;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.CheckOutProcess;
import steps.LoginPage;
import steps.SearchProductProcess;

import java.util.concurrent.TimeUnit;

public class ProductPurchasingProcess {

    WebDriver driver;


    @Given("Logged user can search Hummingbird Printed Sweater")
    public void LoginAndSearch() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.SignIn("Amalysz@mail.com","Amalysz");

        SearchProductProcess searchProductProcess = new SearchProductProcess(driver);
        searchProductProcess.SearchProduct();
    }

    @When("User can select size and amount of product")
    public void ProductDetails(){
        SearchProductProcess searchProductProcess = new SearchProductProcess(driver);
        searchProductProcess.SetProductDetails("M","5");
    }

    @And("User can add order to cart, go to check out options and select shipping address")
    public void CheckOut() {
        CheckOutProcess checkOutProcess = new CheckOutProcess(driver);
        checkOutProcess.CheckOutSteps();
    }
    @And("User can select method of receipt \"pick up in store\"")
    public void MethodOfReceipt() {
        CheckOutProcess checkOutProcess = new CheckOutProcess(driver);
        checkOutProcess.SelectMethodOfReceipt();
    }
    @And("User can chose Pay by Check in payment method and click \"order with an obligation to pay\"")
    public void PaymentDetails() {
        CheckOutProcess checkOutProcess = new CheckOutProcess(driver);
        checkOutProcess.PaymentDetailsSteps();
    }
}
