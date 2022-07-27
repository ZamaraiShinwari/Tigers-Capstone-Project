package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;

public class RetailStepDefinition extends Base {

	RetailPageObject retailPage = new RetailPageObject();

	
	@Given("user is on Retail website")
	public void user_is_on_Retail_Website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";

		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Acutal Title is matching with expected title");
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccount();
		logger.info("Register for an affiliate Account");

	}
	@When("User click on login")
	public void user_click_on_login() {
	    retailPage.clickOnLogin();
	}
	@When("user enter username 'userName'and password'password'")
	public void user_enter_username_user_name_and_password_password() {
	    retailPage.enterUserName("zamary_humraaz@yahoo.com");
	    retailPage.enterUserPassword("Z1988@010203z");
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
	   retailPage.clickOnLoginButton();
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	   Assert.assertTrue(retailPage.myAccountText());
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.clickOnRegisterForAffiliatAccount();

	}


	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompanyName(data.get(0).get("company"));
		retailPage.enteWebsite(data.get(0).get("website"));
		retailPage.enterTaxId(data.get(0).get("taxtID"));
		retailPage.selectPaymentMethod(data.get(0).get("paymentMethod"));
		logger.info("Registrstion from is filled successfull");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.checkAboutUsBox();

	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		retailPage.clickOnContinueButton();

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message(String string) {
		retailPage.successMessageForAffiliateAccount();

	}

	@When("User click on 'Edit your affiliate information'link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPage.clickOnEditAffiliateAccount();

	}

	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.clickOnBankTransferButton();

	}

	@When("User fill Bank information with bellow information")
	public void user_fill_bank_information_with_bellow_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompanyName(data.get(0).get("bankName"));
		retailPage.enteWebsite(data.get(0).get("abaNumber"));
		retailPage.enterTaxId(data.get(0).get("swiftCode"));
		retailPage.selectPaymentMethod(data.get(0).get("accountName"));
		retailPage.selectPaymentMethod(data.get(0).get("accountNumber"));
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button1() {
		retailPage.clickOnContinueButton();

	}

//	@Then("User should see success message{string}")
//	public void user_should_see_success_message(String string) {
	//	String ExpectedResult = "Success: Your account has been successfully updated";
//		String ActualResult = retailPage.

//	}

	@When("User click on 'Edit your account information'link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickOnEditAccountInformationLink();

	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> AccountInfo = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(AccountInfo.get(0).get("firstname"));
		retailPage.enterLastName(AccountInfo.get(0).get("lastName"));
		retailPage.enterEmail(AccountInfo.get(0).get("email"));
		retailPage.enterTelephoneNumber(AccountInfo.get(0).get("telephone"));
		logger.info("The bank acoount information is verified successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		retailPage.editYourAccountInformationLinkSuccessMessage();

	}
}
