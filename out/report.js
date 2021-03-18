$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/proces-zakupu.feature");
formatter.feature({
  "line": 1,
  "name": "Product purchasing process",
  "description": "",
  "id": "product-purchasing-process",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can go through the product purchasing process",
  "description": "",
  "id": "product-purchasing-process;user-can-go-through-the-product-purchasing-process",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Logged user can search Hummingbird Printed Sweater",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User can select size and amount of product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User can add order to cart, go to check out options and select shipping address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can select method of receipt \"pick up in store\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User can chose Pay by Check in payment method and click \"order with an obligation to pay\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User can make an screenshot of order confirmation and price",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductPurchasingProcess.LoginAndSearch()"
});
formatter.result({
  "duration": 5168255900,
  "status": "passed"
});
formatter.match({
  "location": "ProductPurchasingProcess.ProductDetails()"
});
formatter.result({
  "duration": 239289400,
  "status": "passed"
});
formatter.match({
  "location": "ProductPurchasingProcess.CheckOut()"
});
formatter.result({
  "duration": 2702552100,
  "status": "passed"
});
formatter.match({
  "location": "ProductPurchasingProcess.MethodOfReceipt()"
});
formatter.result({
  "duration": 722769700,
  "status": "passed"
});
formatter.match({
  "location": "ProductPurchasingProcess.PaymentDetails()"
});
formatter.result({
  "duration": 900929700,
  "status": "passed"
});
formatter.match({
  "location": "ProductPurchasingProcess.Screenshot()"
});
formatter.result({
  "duration": 337705700,
  "status": "passed"
});
});