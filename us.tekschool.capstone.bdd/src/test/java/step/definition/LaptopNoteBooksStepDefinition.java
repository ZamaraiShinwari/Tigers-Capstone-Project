package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject lapTopAndNotBook = new LaptopNoteBooksPageObject();

	@Given("User is on Retail website {string}")
	public void user_is_on_retail_website(String string) {
		lapTopAndNotBook.testEnvironment();
		logger.info("user clicked on Retail website");
	}

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapTopAndNotBook.clickOnLaptabAndNoteBookTab();
	}

	@When("User click on Show all Laptop & NoteBook  option")
	public void user_click_on_show_all_laptop_note_book_option12() {
		lapTopAndNotBook.lapTopAndNotBookShowAllOption();
	}

	@Given("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		lapTopAndNotBook.clickOnMacBookItem();

	}

	@Given("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		lapTopAndNotBook.clickOnAddTotheCartButton();
	}

	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) {
		String expectedText = "Success: You have added MacBook to your shopping cart!";
		String actualText = lapTopAndNotBook
				.youHaveAddedMacbookToCartSuccessMessage("Success: You have added MacBook to your shopping cart!");
		Assert.assertEquals(expectedText, actualText);
		logger.info("Show MacBook in Shopping Cart");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		lapTopAndNotBook.itemintheCart();

		logger.info("Show Items in the Cart");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapTopAndNotBook.clickOnCartOption();
	}

	@Then("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapTopAndNotBook.clickOnRedXButton();
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		lapTopAndNotBook.ItemsRemovedCartShowMessage();
	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		lapTopAndNotBook.clickOnProductComparisonMacBook();
		logger.info("macbook product comparison button clicked");
		Thread.sleep(2000);
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		lapTopAndNotBook.clickOnProductComparisonMacBookAir();
		logger.info("user click on macbookAir comparison button");
		Thread.sleep(2000);

	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String string) throws InterruptedException {
		lapTopAndNotBook.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfulle to product comparison");
		Thread.sleep(2000);
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		lapTopAndNotBook.clickOnproductComprison();
		Thread.sleep(2000);
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
		lapTopAndNotBook.productCompareItem();
		Thread.sleep(2000);
	}

	@Given("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		lapTopAndNotBook.clickOnHeartIconOfSonyVAIO();

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		lapTopAndNotBook.youMustLogin();
		logger.info("Show login or Creat new Account");
	}

	@Given("User click on {string} item")
	public void user_click_on_item(String string) {
		lapTopAndNotBook.clickOnMacBookProItem();

	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		lapTopAndNotBook.macBookPriceTagOnUI();
	}

}