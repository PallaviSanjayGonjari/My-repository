package neoStoxPOMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignInPage 
{
	@FindBy(xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber']")private WebElement mobileNumberField;
	@FindBy(xpath = "//a[@class='btn btn-signup']")private WebElement signInButton;

	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNumber(String mobNo)
	{
		mobileNumberField.sendKeys(mobNo);
		Reporter.log("Entering mobile number", true);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
		Reporter.log("Clicking on sign in button", true);
	}
}
