package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/proces-zakupu.feature",
        plugin = {"pretty","html:out"}
)

public class ProductPurchasingProcessTest {
}
