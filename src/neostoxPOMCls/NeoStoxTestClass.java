package neostoxPOMCls;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String mobNo = mysheet.getRow(0).getCell(0).toString();
		String pass = mysheet.getRow(0).getCell(1).toString();
		String expectedUserName = mysheet.getRow(0).getCell(2).toString();
		
		
		//Create object of NeoStox Home Page
		NeoStoxHomePage home=new 	NeoStoxHomePage(driver);
		home.clickOnsignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Create object of signIn Page
		NeoStoxSignInPage signIn=new NeoStoxSignInPage(driver);
		signIn.enterMobileNumber(mobNo);
		signIn.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Create Object of Password Page
		Thread.sleep(1000);
		NeoStoxPasswordPage password=new NeoStoxPasswordPage(driver);
		password.enterPassword(pass);
		password.clickOnSubmitButtom();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Create Object of DashBoard Page
		NeoStoxDashboardPage dashboard=new NeoStoxDashboardPage(driver);
		dashboard.handlePopUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		//Hilighter.HilightUserName(username, driver);
		
		Hilighter.drawBorder(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	//	dashboard.validateUserName(expectedUserName);
		//dashboard.logoutFromNeoStox();
		
		//driver.close();
		
		
		
	}

}
