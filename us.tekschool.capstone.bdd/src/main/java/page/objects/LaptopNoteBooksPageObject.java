package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement lapTopAndNotebookTab;
	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement laptopAndNoteBookOption;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickOnAddToCartButton;
	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement cartSuccessMessage;
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement ItemInTheCart;
	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement clickOnCartOption;
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removingItemsButton;
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement shoppingCartIsEmptyMessage;

	public void testEnvironment() {
		testEnvironment.click();
	}

	public void clickOnLaptabAndNoteBookTab() {
		lapTopAndNotebookTab.click();
	}

	public void lapTopAndNotBookShowAllOption() {
		laptopAndNoteBookOption.click();
	}

	public void clickOnMacBookItem() {
		macBookItem.click();
	}

	public void clickOnAddTotheCartButton() {
		clickOnAddToCartButton.click();
	}

	public String youHaveAddedMacbookToCartSuccessMessage(String string) {
		cartSuccessMessage.getText();
		return string;
	}
	public void itemintheCart() {
		ItemInTheCart.isDisplayed();
	}




	public void clickOnCartOption() {
		clickOnCartOption.click();
	}

	public void clickOnRedXButton() {
		removingItemsButton.click();
	}

	public boolean ItemsRemovedCartShowMessage() {
		if (shoppingCartIsEmptyMessage.isDisplayed()) {
			return true;
		} else
			return false;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookCompareButton;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement makBookAirCompareButton;

	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement succesAddMacBookAirtoProductCompare;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement clickOnproductComprison;

	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItem;

	public void clickOnProductComparisonMacBook() {
		macBookCompareButton.click();
	}

	public void clickOnProductComparisonMacBookAir() {
		makBookAirCompareButton.click();
	}

	public void succesAddMacBookAirtoProductCompare() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
	}

	public void clickOnproductComprison() {
		clickOnproductComprison.click();
	}

	public void productCompareItem() {
		productCompareItem.isDisplayed();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnHeartIcon;
	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]")
	private WebElement loginAndCreatAccountMessage;
	@FindBy(xpath = "//*[text()=' You must ']")
	private WebElement youMustLogin;

	public void clickOnHeartIconOfSonyVAIO() {
		clickOnHeartIcon.click();
	}

	public String logginToCreateAccountToSaveSonyVAIO(String string) {
		loginAndCreatAccountMessage.getText();
		return string;
	}
	public void youMustLogin() {
		youMustLogin.isDisplayed();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement clickOnMacBoolPro;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement macProPriceTag;

	public void clickOnMacBookProItem() {
		clickOnMacBoolPro.click();

	}

	public boolean macBookPriceTagOnUI() {
		if(macProPriceTag.isDisplayed()) {
			return true;
		}else 
			return false;
	}

}
