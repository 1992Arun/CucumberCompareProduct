Feature: Verify adding the product for comparision 

Scenario: Verify adding the product for comparision from List View of Product Category or Sub Category page

Given Open the Application URL in any supported browser

When  Hover the mouse on any Menu say Desktops and select Show All Desktops option 

And In the displayed Desktops category page, select List View option

And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page 

Then Text Should be displayed

And Click on the "Compare this options"

And You have added Product Name to your product comparison! should be displayed

And Click on the "product comparision link" 

And User should be taken to the Product Comparison page with the details of the Product that we have added for comparision. 