package neoStoxPOMClassess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxDashBoardPage 
{
	@FindBy(xpath ="(//a[text()='OK'])[2]")private WebElement popUpOkButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement popUpCloseButton;
	@FindBy(id = "lbl_username")private WebElement userNameText;
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logOutButton;
	@FindBy(id = "lbl_curbalancetop") private WebElement acBalance;
	
	public NeoStoxDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void handlePopUp(WebDriver driver) throws InterruptedException
	{
		if(popUpOkButton.isDisplayed())
		{
			Thread.sleep(2000);
			Utility.scrollIntoView(driver, popUpOkButton);
			popUpOkButton.click();
			Reporter.log("Clicking on PopUp OK button", true);
			Thread.sleep(500);
			popUpCloseButton.click();
			Reporter.log("Clicking on PopUp Close button", true);
			Thread.sleep(500);
			System.out.println(popUpOkButton.isDisplayed());
		}
		else
		{
			Reporter.log("There is no PopUp ", true);
		}
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
	
	public void drawBorder(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("lbl_username")));
		Reporter.log("Drawing border to UserName", true);
	}
	
	public String getACCBalance()
	{
		String balance=acBalance.getText();
		Reporter.log("Get Account Balance", true);
		Reporter.log("Account Balance is "+balance, true);
		return balance;
		
	}
}
