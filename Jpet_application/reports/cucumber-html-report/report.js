$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Jpet_feature/Jpet_Application.feature");
formatter.feature({
  "line": 1,
  "name": "Jpet application",
  "description": "",
  "id": "jpet-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To check the application sign in function and verify user name",
  "description": "",
  "id": "jpet-application;to-check-the-application-sign-in-function-and-verify-user-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_SignIn_and_CompareName"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch application homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "to check for signin",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "proceed to signin",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "to check for compare name",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.launchapplication()"
});
formatter.result({
  "duration": 16098557404,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.click_on_signIn()"
});
formatter.result({
  "duration": 1399833857,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\"MenuContent\"]/a[2]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027DESKTOP-IKGN2NK\u0027, ip: \u0027192.168.43.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.Jpet.pages.Jpet_SignIn_and_CompareName_page.clicksignin(Jpet_SignIn_and_CompareName_page.java:51)\r\n\tat com.Jpet.steps.Jpet_SignIn_and_CompareName_steps.click_on_signIn(Jpet_SignIn_and_CompareName_steps.java:21)\r\n\tat ✽.When click on signin button(src/main/resources/Jpet_feature/Jpet_Application.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.LaunchBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.click_signIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.comparename()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.close()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "To print bill details table and my orders table from the application",
  "description": "",
  "id": "jpet-application;to-print-bill-details-table-and-my-orders-table-from-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC02_PrintBill_and_MyOrdersTable"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "launch application homepage for print table",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "click on signin button to print talbe",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "to check for signin to print table",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "proceed to signin for print table",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "select a product for bill",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "to check for printbill",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "To print myorders table",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close browser for print table",
  "keyword": "And "
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.launchapplication()"
});
formatter.result({
  "duration": 5200440752,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.click_on_signIn()"
});
formatter.result({
  "duration": 482116760,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.LaunchBrowser()"
});
formatter.result({
  "duration": 6899323142,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.click_signIn()"
});
formatter.result({
  "duration": 841660956,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.selectproduct()"
});
formatter.result({
  "duration": 2287406191,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.applicationhomepage()"
});
formatter.result({
  "duration": 523533231,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.print_myorder_table()"
});
formatter.result({
  "duration": 1052677385,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.end()"
});
formatter.result({
  "duration": 173870734,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "To add five products to cart and remove products",
  "description": "",
  "id": "jpet-application;to-add-five-products-to-cart-and-remove-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@TC03_Addproducts_and_RemoveFromCart"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "launch application homepage for cart",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "select product category",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "select product",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "To check for add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "to check for remove from cart",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "close browser for remove from cart",
  "keyword": "And "
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.launchapplication()"
});
formatter.result({
  "duration": 4841507768,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.select_catogory()"
});
formatter.result({
  "duration": 409012329,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.select_product()"
});
formatter.result({
  "duration": 394688670,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.addtocart()"
});
formatter.result({
  "duration": 471411541,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.signin()"
});
formatter.result({
  "duration": 11198276576,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.exit()"
});
formatter.result({
  "duration": 149830388,
  "status": "passed"
});
});