package page.objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	 
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}	
		
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement clickOnMyAccountButton;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement clickOnLogin;
	@FindBy(xpath = " //*[@id=\"input-email\"]")
	private WebElement userNameFeild;
	@FindBy(xpath = "//*[@id=\"input-password\"]")
	private WebElement userPassWordFeild;
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement Myacount;
	
	public void clickOnMyAccount() {
		clickOnMyAccountButton.click();
	}
	public void clickOnLogin() {
		clickOnLogin.click();
	}
	public void enterUserName(String userName) {
		userNameFeild.sendKeys(userName);
	}
	public void enterUserPassword( String password) {
		userPassWordFeild.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
		
	}
	public boolean myAccountText() {
		if (Myacount.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliatAccount;
	@FindBy(xpath ="//*[@id=\"input-company\"]")
	private WebElement companyFeild;
	@FindBy(xpath = "//*[@id=\"input-website\"]")
	private WebElement webSiteFeild;
	@FindBy(xpath ="//*[@id=\"input-tax\"]")
	private WebElement taxIdFeild;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label/input")
	private WebElement paymentMethodOption;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1] ")
	private WebElement checkOnAboutUsBox;
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement clickOnContinueButtoon;
	
	public void clickOnRegisterForAffiliatAccount() {
		registerForAffiliatAccount.click();
	}

	public void enterCompanyName(String companyName) {
		companyFeild.sendKeys(companyName);
	}
	public void enteWebsite(String website) {
		webSiteFeild.sendKeys(website);
	}
	public void enterTaxId(String taxId) {
		taxIdFeild.sendKeys(taxId);
	}
	public void selectPaymentMethod(String paymentMethod) {
		paymentMethodOption.click();
	}
	public void checkAboutUsBox() {
		checkOnAboutUsBox.click();
	}
	public void clickOnContinueButton() {
		clickOnContinueButtoon.click();
	}
	
	
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[2]")
	private WebElement editMyAffiliateAccountLink;
	@FindBy(xpath = " //*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label/input")
	private WebElement bankTransferRadioButton;
	@FindBy(xpath = "//*[@id=\"input-bank-name\"] ")
	private WebElement bankNameFeild;
	@FindBy(xpath = "//*[@id=\"input-bank-branch-number\"]")
	private WebElement abaNumberFeild;
	@FindBy(xpath = " //*[@id=\"input-bank-swift-code\"]")
	private WebElement swiftCodeFeild;
	@FindBy(xpath = " //*[@id=\"input-bank-account-name\"]")
	private WebElement accountNameFeild;
	@FindBy( xpath = "//*[@id=\"input-bank-account-number\"]")
	private WebElement accountNumberFeild;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	private WebElement clickOnContinueButton;
	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement affiliateAccountSuccessMessage;
	
	public boolean successMessageForAffiliateAccount() {
		if(affiliateAccountSuccessMessage.isDisplayed()) {
			return true;
	}else 
		return false;
	}
	public void clickOnEditAffiliateAccount() {
		editMyAffiliateAccountLink.click();
	}
	public void clickOnBankTransferButton() {
		bankTransferRadioButton.click();
	}
	public void enterBankName (String bankName) {
		bankNameFeild.sendKeys(bankName);
	}
	public void enterAbaNumber(String abaNumber) {
		abaNumberFeild.sendKeys(abaNumber);
	}
	public void enterSwiftCode(String swiftCode) {
		swiftCodeFeild.sendKeys(swiftCode);
	}
	public void enterAccountName(String accountName) {
		accountNameFeild.sendKeys(accountName);
	}
	public void enterAccountNumber(String accountNumber) {
		accountNumberFeild.sendKeys(accountNumber);
	}
	public void ContinueButton() {
		clickOnContinueButton.click();
		
	}
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement editYourAccountInformationLink;
	@FindBy(xpath = "//*[@id=\"input-firstname\"]")	
	private WebElement firstNameFeildEditAccount;
	@FindBy(xpath = " //*[@id=\"input-lastname\"]")
	private WebElement lastNameFeildEditAccount;
	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement emailFeildEditAccount;
	@FindBy(xpath = "//*[@id=\"input-telephone\"]")
	private WebElement telePhoneFeildEditAccount;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement clickOnContinueButtonEditAccount;
	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement successMessageForEditYourAccountInformationLink;
	
	public boolean editYourAccountInformationLinkSuccessMessage() {
		if(successMessageForEditYourAccountInformationLink.isDisplayed()) {
			return true;
		}else
			return false;
	}
	
	public void clickOnEditAccountInformationLink() {
		editYourAccountInformationLink.click();
	}
	public void enterFirstName(String Zam) {
		firstNameFeildEditAccount.clear();
		firstNameFeildEditAccount.sendKeys(Zam);
	}
	public void enterLastName(String Leo) {
		lastNameFeildEditAccount.clear();
		lastNameFeildEditAccount.sendKeys(Leo);
	}
	public void enterEmail(String email) {
		emailFeildEditAccount.clear();
		emailFeildEditAccount.sendKeys(email);
	}
	public void enterTelephoneNumber(String phoneNumber) {
		telePhoneFeildEditAccount.clear();
		telePhoneFeildEditAccount.sendKeys(phoneNumber);
	}
	public void clickOnContinueBox() {
		clickOnContinueButtonEditAccount.click();
		
	}
	
	
	}
	
	
	
	

