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
  "duration": 6013297603,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.click_on_signIn()"
});
formatter.result({
  "duration": 400882018,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.LaunchBrowser()"
});
formatter.result({
  "duration": 6517008831,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.click_signIn()"
});
formatter.result({
  "duration": 811261736,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.comparename()"
});
formatter.result({
  "duration": 54197962,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_SignIn_and_CompareName_steps.close()"
});
formatter.result({
  "duration": 127007324,
  "status": "passed"
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
  "duration": 4741182524,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.click_on_signIn()"
});
formatter.result({
  "duration": 534291911,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.LaunchBrowser()"
});
formatter.result({
  "duration": 5389186213,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.click_signIn()"
});
formatter.result({
  "duration": 776631832,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.selectproduct()"
});
formatter.result({
  "duration": 3204164575,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.applicationhomepage()"
});
formatter.result({
  "duration": 606692599,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.print_myorder_table()"
});
formatter.result({
  "duration": 1227141853,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_PrintBill_and_MyOrdersTable_steps.end()"
});
formatter.result({
  "duration": 170717000,
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
  "duration": 16021396557,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.select_catogory()"
});
formatter.result({
  "duration": 358162414,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.select_product()"
});
formatter.result({
  "duration": 429348902,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.addtocart()"
});
formatter.result({
  "duration": 680541384,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.signin()"
});
formatter.result({
  "duration": 11481017193,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_AddProducts_and_RemoveFromCart_steps.exit()"
});
formatter.result({
  "duration": 139236720,
  "status": "passed"
});
});