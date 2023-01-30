package neoStoxPOMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxPasswordPage 
{
	@FindBy(id = "txt_accesspin")private WebElement passwordField;
	@FindBy(xpath = "//a[@id='lnk_submitaccesspin']")private WebElement submitButton;
	public  NeoStoxPasswordPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String pass)
	{
		passwordField.sendKeys(pass);
		Reporter.log("entering password", true);
	}
	public void clickOnSubmitButtom()
	{
		submitButton.click();
		Reporter.log("clicking on submit button", true);
	}
}
