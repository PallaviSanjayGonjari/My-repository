package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	//excel
	//wait
	//screenshot
	//scrollIntoView
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Data is "+value,true);
		return value;
		
	}
	
	public static void implicitWait(int time,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Waiting for"+time+"ms",true);
		
	}
	
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File locate=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+fileName+".png");
		FileHandler.copy(screenshot, locate);
		Reporter.log("Taking screenshot",true);
		Reporter.log("Screenshot taken saved at "+locate,true);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("scrolling into view to"+element.getText(), true);
	}
	
	
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\A\\eclipse-workspace\\20_Aug_Evening_Selenium\\myProperty.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
		
		
		
	}
}

	