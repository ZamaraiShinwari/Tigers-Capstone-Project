package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObj;
import utilities.Utils;

public class DesktopTabDef extends Base {
	DesktopPageObj desktopPage = new DesktopPageObj();
	
	@Given("User is on Retail website")
		public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = desktopPage.userIsOnRetailWebsite();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Retail page was verified");
	}
	@When("User click on Desktops tab")
	public void User_click_on_Desktops_tab() {
		desktopPage.clickOnDesktopsTab();
		logger.info("User Clicked on Desktops tab");
	}

	@And("User click on Show all desktops")
	public void User_click_on_Show_all_desktops() {
		desktopPage.clickOnshowAllDesktop();
		logger.info("User Clicked on Show all desktop");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopItems();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
		}
		//Utils.takeScreenshotForStep();

	}

	@And("User click ADD TO CART option on HP LP3065 item")
	public void User_click_ADD_TO_CART_option_on_HP_LP3065_item() {
		desktopPage.clickOnHpLp3065AddToCart();
		logger.info("User Clicked Add to cart option");

	}

	@When("User select quantity {string}")
	public void User_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("User selected quantity" + string);
	}

	@When("User click on add to Cart button")
	public void User_click_on_add_to_Cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("User Clecked add to the cart button");
	}

	@Then("User should see a Message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertTrue(desktopPage.successMessage());
		Utils.takeScreenShot();
	}

	@And("User click ADD To CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEos5D();
		logger.info("User Clicked add to the cart option");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.selectRedColor();


	}

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEos5D();

	}
//	@Then("User should see a message{String}")
//	public void User_should_see_a_message() {
//		desktopPage.canonEosCameraSuccessMessage();
		
//	}
//	public void User_should_see_a_message(String expectedSuccessfulMessage) {
	//	Assert.assertEquals(desktopPage.canonEosCameraSuccessMessage(), expectedSuccessfulMessage);
		//logger.info(expectedSuccessfulMessage +"equals to" + desktopPage.canonEosCameraSuccessMessage()) ;
		
		
		
//	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnReviewLink();

	}

	@And("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktopPage.enterYourName(reviewInformation.get(0).get("yourname"));
		desktopPage.enterYourReview(reviewInformation.get(0).get("yourReview"));
		desktopPage.selectRatingRadioButton();
		Thread.sleep(2000);

	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() throws InterruptedException {
		desktopPage.clickOnContinueButton();
		Thread.sleep(2000);
	}

	@Then("User should see a message with {string}")
	public void User_should_see_a_message_with(String string) throws InterruptedException {
		desktopPage.webamsterReviewApproval();
		Thread.sleep(2000);

	}

 }
