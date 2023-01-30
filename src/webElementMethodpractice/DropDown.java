package webElementMethodpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class DropDown {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://news.abplive.com/utility/age-calculator.html");
		  Thread.sleep(1000);
		  System.out.println("Let me calculate my age....");
		  driver.manage().window().maximize();
		
		  //Handling DropDown..
		  /********************************************************************************************/ 
		   WebElement date=driver.findElement(By.xpath("//select[@id='birthdate_from']"));
		   Select s2=new Select(date);
		   date.click();
		   s2.selectByVisibleText("13");
		   Thread.sleep(1000);
		   /********************************************************************************************/   
		   WebElement month = driver.findElement(By.xpath("//select[@id='birthmonth_from']"));
		   Select s1=new Select(month);
		   month.click();
		   s1.selectByIndex(5);
		   Thread.sleep(1000);
		  /********************************************************************************************/ 
		   WebElement year=driver.findElement(By.xpath("//select[@id='birthyear_from']"));
		   Select s3=new Select(year);
		   year.click();
		   s3.selectByValue("1995");
		   Thread.sleep(2000);
		   /********************************************************************************************/  
		   
		   WebElement currentdate=driver.findElement(By.xpath("//select[@id='birthdate_to']"));
		   Select t2=new Select(currentdate);
		   currentdate.click();
		   t2.selectByVisibleText("26");
		   Thread.sleep(1000);
		   /********************************************************************************************/  
		   WebElement currentmonth = driver.findElement(By.xpath("//select[@id='birthmonth_to']"));
		   Select t1=new Select(currentmonth);
		   currentmonth.click();
		   t1.selectByIndex(10);
		   Thread.sleep(1000);
		   /********************************************************************************************/  
		   WebElement currentyear=driver.findElement(By.xpath("//select[@id='birthyear_to']"));
		   Select t3=new Select(currentyear);
		   currentyear.click();
		   t3.selectByValue("2022");
		   Thread.sleep(1000);
		   /********************************************************************************************/  
		   
		   String Random=RandomString.make(2);
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File fs=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+Random+".jpg");
		    FileHandler.copy(source, fs);
		    Thread.sleep(1000);
		    /********************************************************************************************/ 
		   
		   driver.findElement(By.xpath("//button[@id='ageExact']")).click();
		   Thread.sleep(2000);
		   System.out.println("My current age is 27 years 5 months 20 days");
		   /********************************************************************************************/ 
		   
		    String next=RandomString.make(2);
		    File newsource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File fnxt=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+next+".jpg");
		    FileHandler.copy(newsource, fnxt);
		    /********************************************************************************************/ 
		   driver.close();
		   
	}

}
