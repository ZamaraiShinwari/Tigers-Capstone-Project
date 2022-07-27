package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObjectJava extends Base {
	
	public HomePageObjectJava() {
		PageFactory.initElements(driver, this);
		}	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userIsOnRetailPageOne;
		
		@FindBy(xpath = "//span[text() ='Currency']")
		private WebElement clickOnCurrency;
		@FindBy(xpath = "//button[@name='EUR']")
		private WebElement chooseEuroFromDD;
		@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a/span")
		private WebElement clickOnShoppingCart;
		@FindBy(xpath = "//*[@id=\"cart\"]/ul/li/p")
		private WebElement ShoppingCartIsEmpty;
		@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button")
		private WebElement currencyTextChangedToEuro;
		
		public String userIsOnRetailWebsiteOne() {
			String textFromUI = userIsOnRetailPageOne.getText();
			return textFromUI;
		}
		public void clickOnCurrencyDD() {
			clickOnCurrency.click();
		}
		public void chooseEuroFromDD() {
			chooseEuroFromDD.click();
			
		}
		
		public void UserclickOnShoppingCart() {
			clickOnShoppingCart.click();
		}
		
		public void shoppingCartIsEmptySuccessMessage() {
			ShoppingCartIsEmpty.getText();
		}
		public boolean curremcyTabChangedToEuro() {
			if(currencyTextChangedToEuro.isDisplayed()) {
			return true;
			}else {
			return false;
		}

	

		}}
		
		
	
	
	
	
	
	




