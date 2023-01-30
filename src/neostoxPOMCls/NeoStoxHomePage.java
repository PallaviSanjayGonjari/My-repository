package neostoxPOMCls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePage
{

	
	@FindBy(xpath = ("(//a[text()='Sign In'])[1]"))private WebElement signInButton;
	
	
	
	
	public  NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnsignInButton()
	{
		signInButton.click();
	}

}
