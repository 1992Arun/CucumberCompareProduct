Feature: Verify  the product comparision functionality

Scenario: Verify adding the product for comparision from Product Display Page

Given  Open the Application URL in any supported browser

When Enter any existing Product name into the Search text box field

|Product1|iMac|
| Product2 | iPhone |


When Click on the "searchicon"

And Click on the "Product" 

And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page 

Then Text Should be displayed

And Click on the "Compare this options"

And You have added Product Name to your product comparison! should be displayed

And Click on the "product comparision link" 

And User should be taken to the Product Comparison page with the details of the Product that we have added for comparision. 