Feature: Jpet application

@TC01_SignIn_and_CompareName
Scenario:
			To check the application sign in function and verify user name
Given launch application homepage
When click on signin button
Then to check for signin
Then proceed to signin
Then to check for compare name
And close browser

@TC02_PrintBill_and_MyOrdersTable
Scenario:
			To print bill details table and my orders table from the application
Given launch application homepage for print table
When click on signin button to print talbe
Then to check for signin to print table
Then proceed to signin for print table
Then select a product for bill
Then to check for printbill
Then To print myorders table
And close browser for print table

@TC03_Addproducts_and_RemoveFromCart
Scenario:
			To add five products to cart and remove products
Given launch application homepage for cart
When select product category
Then select product
Then To check for add to cart
Then to check for remove from cart
And close browser for remove from cart