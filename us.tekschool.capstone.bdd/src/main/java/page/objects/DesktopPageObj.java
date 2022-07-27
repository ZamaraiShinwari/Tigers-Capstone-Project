package page.objects;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class DesktopPageObj extends Base {
	
	public DesktopPageObj() {
		PageFactory.initElements(driver, this);
}		
		@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
		private WebElement  desktops;
		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement showAllDesktops;
		
		@FindBy(tagName = "img")
		private List<WebElement> items;
		
		public void clickOnDesktopsTab() {
			Utils.hoveMouseOverElement(desktops);
		}
		
		
		
		
		
		
		public List<WebElement> desktopItems(){
			List<WebElement> itemsDesk = items;
			return itemsDesk;
		}
		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
		private WebElement hpLp3065;
		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
		private WebElement addingEos5DCamera;
		@FindBy(xpath ="//*[@id=\"input-option226\"]")
		private WebElement canonCameraDropDown;
		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]/span")
		private WebElement clickOnCanonEos5DCamera;
		@FindBy(xpath = "//a[text()='Write a review']")
		private WebElement writeAreviewLink;
		@FindBy(id = "input-name")
		private WebElement yourNameFeild;
		@FindBy(id="input-review")
		private WebElement yourReviewFeild;
		@FindBy(xpath = "//input[@type='radio]")
		private List<WebElement> rating;
		
		@FindBy(xpath = "//input[@name='rating' and @value='5']")
		private WebElement ratingRadionButton;
		
		@FindBy(xpath = "//*[@id=\"button-review\"]")
		private WebElement reviewContinueButton;
		@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
		private String reviewSubmissionMessage;
		@FindBy(id = "input-quantity")
		private WebElement quantityInput;
		
		@FindBy(id = "button-cart")
		private WebElement addToTheCartButton;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement hpLpSuccessMessage;
		@FindBy(xpath = "//*[@id=\"input-option226\"]")
		private WebElement choosingRedColor;
		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
		private WebElement userIsOnRetailPage;
		@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
		private WebElement webmasterApprovalReview;
		@FindBy(xpath = "//*[text()='EOS 5D Camera'])[3]")
		private WebElement canonEOS5DCameraSuccessMessage;
		
		public void webamsterReviewApproval() {
			webmasterApprovalReview.getText();
		}
		
		public String userIsOnRetailWebsite() {
			String textFromUI = userIsOnRetailPage.getText();
			return textFromUI;
		}
		public void clickOnHpLp3065AddToCart() {
			hpLp3065.click();
		}
		public void selectQuantity(String quantityValue) {
			quantityInput.clear();
			quantityInput.getText();
		}
		
		public void clickOnAddToCartButton() {
			addToTheCartButton.click();
		}
		 public boolean successMessage() {
				if (hpLpSuccessMessage.isDisplayed())
					return true;
				else
					return false;
			}
		 //public String canonEosCameraSuccessMessage() {
			//String actualResults = "Success: You have added "+canonEOS5DCameraSuccessMessage.getText()+" to your shopping cart!";
			//return actualResults;
		// public String canonEosCameraSuccessMessage() {
		//	 String actualREsults =  "Success: You have added Canon EOS 5D Camera to your shopping cart!";
		//	 return actualREsults = canonEOS5DCameraSuccessMessage.getText();
			
			
		// }
		 public void clickOnCanonEos5D() {
			 clickOnCanonEos5DCamera.click();
		 }
		public void clickOnReviewLink() {
			writeAreviewLink.click();
		}
		public void selectRating(String ratingValue) {
			List<WebElement> ratingElements = rating;
			for(WebElement element:ratingElements) {
				if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
					element.click();
					break;
				}
			}
		}
		public void clickOnContinueButton() {
			reviewContinueButton.click();
			}
		public void enterYourName(String nameValue) {
			yourNameFeild.sendKeys(nameValue);
		}
		public void enterYourReview(String reviewValue) {
			yourReviewFeild.sendKeys(reviewValue);
		}
		public String reviewText() {
			return reviewSubmissionMessage;
		}
		public void selectRatingRadioButton() {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			ratingRadionButton.click();
		}
		public void clickOnshowAllDesktop() {
			showAllDesktops.click();
		}
		public void selectRedColor() {
			Select select =  new Select(choosingRedColor);
			select.selectByVisibleText("Red");
			
			
		}

}