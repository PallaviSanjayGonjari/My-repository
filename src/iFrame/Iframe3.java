package iFrame;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Iframe3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		//switching main page to frame1/outer frame
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("pallavi");
		
	  //switching focus from frame1 to frame3//inner frame
		driver.switchTo().frame("frame3");
	   Thread.sleep(1000);
		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		//switching inner frame/frame1 to main page
		//frame1 to main page
		Thread.sleep(1000);
		//Thread.sleep(1000);
		driver.switchTo().defaultContent();//frame1 to main page
		String text=driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		//driver.close();
		
		  //Taking screenshot of full page
		String count = RandomString.make(2);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File newplace=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+count+".png");
		FileHandler.copy(src, newplace);
		
		
		//Taking screenshot of section of a web page
				String rolln = RandomString.make(2);
				File newfiles=(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]"))).getScreenshotAs(OutputType.FILE);
				File destination=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+rolln+".png");
				FileHandler.copy(newfiles, destination);
		
		
		
		  //Taking screenshot of single web element
		String rollno = RandomString.make(2);
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples in Selenium Webdriver')]"));
		File newfile=element.getScreenshotAs(OutputType.FILE);
		File destiny=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+rollno+".png");
		FileHandler.copy(newfile, destiny);
		
		
		//type cast driver object into JavaScriptExecutor and store in ref variable
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//using object call method executeScript
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
		
		 
		 
	}

}
