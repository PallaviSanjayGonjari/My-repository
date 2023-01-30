package neostoxPOMCls;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserNeoStoxNameUsingGeneralMethods 
{
	
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashboardPage dash;
	String s="TCID1234";
	
	@BeforeClass
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	//	driver.manage().window().maximize();
		Reporter.log("Launching NeoStoxApp...", true);
		driver.get("https://neostox.com/");
		GeneralMethods.implicitWait(1000, driver);
		home= new NeoStoxHomePage(driver);
		signIn= new NeoStoxSignInPage(driver);
		pwd= new NeoStoxPasswordPage(driver);
		dash= new NeoStoxDashboardPage(driver);
		
	}
	
	@BeforeMethod
	public void loginToNeoStoxApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Clicking on SignIn Button...", true);
		home.clickOnsignInButton();
		GeneralMethods.implicitWait(1000, driver);
		Reporter.log("Enter Mobile Number...", true);
		signIn.enterMobileNumber(GeneralMethods.readDataFromExcel(0, 0));
		Reporter.log("Clicking on SignIn Button...", true);
		signIn.clickOnSignInButton();
		
		GeneralMethods.implicitWait(1000, driver);
		Reporter.log("Enter Password...", true);
		pwd.enterPassword(GeneralMethods.readDataFromExcel(0, 1));
		Reporter.log("Clicking on Submit Button...", true);
		pwd.clickOnSubmitButtom();
		Thread.sleep(1000);
		pwd.clickOnSubmitButtom();
	//	GeneralMethods.clickOnSubmitButton(driver);
		
		Reporter.log("Entered in DashBoard Page...", true);
		GeneralMethods.implicitWait(1000, driver);
		Reporter.log("Handling PopUp...", true);
		GeneralMethods.implicitWait(3000, driver);
		dash.handlePopUp();
		GeneralMethods.implicitWait(1000, driver);
		
	}
	
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException
  {
	  Reporter.log("Validating userName...", true);
	Assert.assertEquals(dash.getActualUserName(), GeneralMethods.readDataFromExcel(0, 2),"Actual and Expected UserNames are not matching TC is Failed...");
	Reporter.log("Highlighting userName with Red Border...", true);
	Hilighter.drawBorder(driver);
	Reporter.log("ScreenShot Taken...", true);
	GeneralMethods.takeScreenShot(driver, s);
  }
  
  @AfterMethod
  public void logOutFromNeoStox()
  {
	  Reporter.log("Loging Out From NeoStox...", true);
	  GeneralMethods.implicitWait(1000, driver);
	  dash.logoutFromNeoStox();
	  
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser...", true);
	  driver.close();
  }
}
