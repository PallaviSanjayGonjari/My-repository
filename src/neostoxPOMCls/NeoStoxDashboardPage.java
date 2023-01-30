package neostoxPOMCls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxDashboardPage 
{
	//1.Data member declaration globally  with access as a private by using @FindBy.....
	@FindBy(xpath ="(//a[text()='OK'])[2]")private WebElement popUpOkButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement popUpCloseButton;
	@FindBy(id = "lbl_username")private WebElement userNameText;
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logOutButton;
	
	
	//2.Initialize within constructor
	public NeoStoxDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handlePopUp() throws InterruptedException
	{
		Thread.sleep(500);
		popUpOkButton.click();
		Thread.sleep(500)
		;
		popUpCloseButton.click();
		Thread.sleep(500);
	}
	
	public void logoutFromNeoStox()
	{
		userNameText.click();
		logOutButton.click();
		Reporter.log("Loging Out From NeoStox", true);
	}
	public String getActualUserName()
	{
		String actualUserName = userNameText.getText();
		return actualUserName;
		
	}
}
