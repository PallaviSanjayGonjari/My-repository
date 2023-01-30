package neostoxPOMCls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage 
{
	//1 Data member declaration--> globally with access level private using --->@findBy Annotation
	@FindBy(id = "txt_accesspin")private WebElement passwordField;
	@FindBy(xpath = "//a[@id='lnk_submitaccesspin']")private WebElement submitButton;
	
	
	//2.Initialize within a constructor with access level public using pagefactory
	public  NeoStoxPasswordPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Utilize within a method with access level public
	public void enterPassword(String pass)
	{
		passwordField.sendKeys(pass);
	}
	public void clickOnSubmitButtom()
	{
		submitButton.click();
	}
}
