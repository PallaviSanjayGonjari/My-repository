package neostoxPOMCls;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserNameValidationTC 
{
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashboardPage dash;
	File myfile;
	Sheet mysheet;
	
	@BeforeClass 
	public void launchNeoStoxApp() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Reporter.log("Launching Application.....", true);
		home= new NeoStoxHomePage(driver);
		signIn= new NeoStoxSignInPage(driver);
		pwd= new NeoStoxPasswordPage(driver);
		dash= new NeoStoxDashboardPage(driver);
		File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
	
	}
	
	@BeforeMethod
	public void logInToNeoStox() throws InterruptedException
	{
		home.clickOnsignInButton();
		
		Reporter.log("Clicking on SignIn Button....", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		signIn.enterMobileNumber(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering Mobile Number....", true);
		signIn.clickOnSignInButton();
		
		Reporter.log("Clicking on SignIn Button....", true);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pwd.enterPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering Password....", true);
		Thread.sleep(100);
		
		pwd.clickOnSubmitButtom();
		Thread.sleep(100);
		pwd.clickOnSubmitButtom();
		Reporter.log("Clicking on Submit Button....", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		Reporter.log("Handling PopUp.....", true);
		dash.handlePopUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	
	@Test
    public void ValidateUserName() 
    {
	 String expectedUserName = mysheet.getRow(0).getCell(2).getStringCellValue();
	 String actualUserName = dash.getActualUserName();
	 Reporter.log("Validating userName....", true);
	 Assert.assertEquals(actualUserName, expectedUserName,"Actual and Expected usernames are not matching TC Failed... ");
	 
    }
	
	@AfterMethod
	public void LoggingOutFromNeoStox() throws InterruptedException
    {
	Reporter.log("Logging Out From NeoStox App....", true);
	dash.logoutFromNeoStox();
		
    }
	
	@AfterClass
	public void ClosingBrowser() throws InterruptedException
	{
		
	Reporter.log("Closing Browser......", true);
	driver.close();

		
	}
}
