package neostoxPOMCls;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethods
{
public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
{
	File myFile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
}

public static void implicitWait(int time,WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
}

public static void takeScreenShot(WebDriver driver,String fileName) throws IOException
{
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
File destiny=new File("G:\\velocity\\SeleniumSCREENSHOTS"+fileName+".png");
FileHandler.copy(src, destiny);
}
 public static void clickOnSubmitButton(WebDriver driver) throws InterruptedException
 {
	
	 JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'Submit')]")));
		Thread.sleep(1000);
 }


}
