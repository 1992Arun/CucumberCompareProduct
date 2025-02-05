package org.step;

import java.util.Map;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.LoginPage;
import org.utility.SearchPage;
import org.utility.UtilityClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	public static SearchPage s;

	public static LoginPage l;

	@Given("Open the Application URL in any supported browser")
	public void open_the_Application_URL_in_any_supported_browser() {

		launchURL(UtilityClass.getPropert("URL"));

		s = new SearchPage();

		l = new LoginPage();
	}

	@When("Enter any existing Product name into the Search text box field")
	public void enter_any_existing_Product_name_into_the_Search_text_box_field(
			io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> data = dataTable.asMap(String.class, String.class);

		sendKeys(l.getSearchBox(), data.get("Product1"));

	}

	@When("Click on the {string}")
	public void click_on_the(String string) {

		if (string.contains("searchicon")) {

			click(l.getSearchButton());

		} else if (string.contains("Product")) {

			click(s.getSearchResults().get(0));

		} else if (string.contains("Compare this options")) {

			click(s.getCompareButton());

		} else if (string.contains("product comparision link")) {

			click(s.getProductComparisonButton());
		}
	}

	@When("Hover the mouse cursor on Compare this Product option from the displayed Product Display Page")
	public void hover_the_mouse_cursor_on_Compare_this_Product_option_from_the_displayed_Product_Display_Page() {

		mouseOver(s.getCompareButton());

		System.out.println("done");
	}

	@Then("Text Should be displayed")
	public void text_Should_be_displayed() {

		boolean displayed;

		try {

			displayed = s.getToolTip().isDisplayed();

		} catch (Exception e) {

			displayed = false;
		}

		System.out.println(getText(s.getToolTip()));

		Assert.assertTrue(displayed);

	}

	@Then("You have added Product Name to your product comparison! should be displayed")
	public void you_have_added_Product_Name_to_your_product_comparison_should_be_displayed() {

		boolean displayed;

		try {

			displayed = s.getAddToCartSucess().isDisplayed();

		} catch (Exception e) {

			displayed = false;
		}

		Assert.assertTrue(displayed);

	}

	@Then("User should be taken to the Product Comparison page with the details of the Product that we have added for comparision.")
	public void user_should_be_taken_to_the_Product_Comparison_page_with_the_details_of_the_Product_that_we_have_added_for_comparision() {

		String text = getText(s.getProductComparePage());

		Assert.assertEquals(UtilityClass.getPropert("ComparepageText"), text);

	}

}
