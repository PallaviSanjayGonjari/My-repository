package excelsheetstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_NeostockUserName_usingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		
		//reading data from excel 
		File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String userid = mysheet.getRow(0).getCell(0).toString();
		String password = mysheet.getRow(0).getCell(1).toString();
		String expectedUserName = mysheet.getRow(0).getCell(2).toString();
		
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).click();
		driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).sendKeys(userid);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Sign Up')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='btn btn-sm neobutton'])[7]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@data-target='modal_buyplans']")).click();
		Thread.sleep(500);
		String actualUserName = driver.findElement(By.xpath("//span[@id='lbl_username']")).getText();
		
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("Your User Name Is correct (As Expected in precondition) so Test case is----> PASS");
		}
		else
		{
			System.out.println("Your User Name Is Incorrect (Not As Expected in precondition) so Test case is----> FAIL");
		}
		driver.close();
	}
	}


