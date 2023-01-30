package neostoxPOMCls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
	//1 Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber']")private WebElement mobileNumberField;
	@FindBy(xpath = "//a[@class='btn btn-signup']")private WebElement signInButton;
	 
	//Initialize within a constructor with access level public using pagefactory
	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNumber(String mobNo)
	{
		mobileNumberField.sendKeys(mobNo);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
}
