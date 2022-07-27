package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.HomePageObjectJava;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObjectJava homePageObj = new HomePageObjectJava();

	@Given("User is on Retail Website")
	public void user_is_on_retail_Website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = homePageObj.userIsOnRetailWebsiteOne();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Retail page was verified");
	}

	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		homePageObj.clickOnCurrencyDD();
		Thread.sleep(3000);

	}

	@When("User Choose Euro from dropdown")
	public void user_choose_euro_from_dropdown()  {
		homePageObj.chooseEuroFromDD();
		
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePageObj.curremcyTabChangedToEuro();

	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObj.UserclickOnShoppingCart();

	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		Assert.assertTrue(homePageObj.curremcyTabChangedToEuro());
		Utils.takeScreenShot();
		logger.info("Show Shopping Cart Message");

	}

}
