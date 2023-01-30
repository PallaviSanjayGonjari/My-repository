package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClassess.NeoStoxDashBoardPage;
import neoStoxPOMClassess.NeoStoxHomePage;
import neoStoxPOMClassess.NeoStoxPasswordPage;
import neoStoxPOMClassess.NeoStoxSignInPage;
import neoStoxUtility.Utility;

public class ValidateUserNeoStoxNameUsingUsingValueDrivenFrmwrk extends Base
{
	NeoStoxDashBoardPage dash;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	
	@BeforeClass
	public void launchNeoStoxApp() throws IOException
	{
		launchBrowser();
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pwd=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
		
	 	
	}
	
	@BeforeMethod
	public void loginToNeoStoxApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		home.clickOnsignInButton();
		Utility.implicitWait(1000, driver);
		
		signIn.enterMobileNumber(Utility.readDataFromPropertyFile("mobile"));
		Thread.sleep(1000);
		signIn.clickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
		pwd.enterPassword(Utility.readDataFromPropertyFile("password"));
		Thread.sleep(1000);
		pwd.clickOnSubmitButtom();
		
		Utility.implicitWait(1000, driver);
		Thread.sleep(1000);
		dash.handlePopUp(driver);
		
	}
	
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException
  {
	 Assert.assertEquals(dash.getActualUserName(), Utility.readDataFromPropertyFile("userName"),"Actual and Expected UserNames are not matching TC Failed....");
	 dash.drawBorder(driver);
	 Utility.takeScreenshot(driver, Utility.readDataFromPropertyFile("TCID1"));
	 
  }
  @Test
  public void validateACBalance() throws IOException
  {
	  Assert.assertNotNull(dash.getACCBalance(),"AC balance is null TC failed...");
	  Utility.takeScreenshot(driver, Utility.readDataFromPropertyFile("TCID2"));
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	  Thread.sleep(1000);
	  dash.logoutFromNeoStox();
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing Browser", true);
	  Thread.sleep(1000);
  }
}
