package webElementMethodpractice;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class GmailAccCreationPage {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		  Thread.sleep(1000);
		 WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		  firstName.click();
		  firstName.sendKeys("Pallavi");
		  Thread.sleep(1000);
		 WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		  lastName.click();
		  lastName.sendKeys("Palsande");
		  Thread.sleep(1000);
		 WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		  userName.click();
		  userName.sendKeys("PPPalsande1");
		  Thread.sleep(1000);
		 WebElement password=driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[4]"));
		  password.click();
		  password.sendKeys("Pallavi@123");
		  Thread.sleep(1000);
		 WebElement confirmpassword=driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[5]"));
		  confirmpassword.click();
		  confirmpassword.sendKeys("Pallavi@123");
		  Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  
		
		   String rollno=RandomString.make(3);
		   WebElement scrnshot=driver.findElement(By.xpath("//img[@class='j9NuTc TrZEUc']"));
		   File origin = ((TakesScreenshot)scrnshot).getScreenshotAs(OutputType.FILE);
		   File locate=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+rollno+".png");
		   FileHandler.copy(origin, locate);
		   
		   String numbering=RandomString.make(3);
		   File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File next=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+numbering+".png");
		   FileHandler.copy(screenshot, next);
		   Thread.sleep(1000);
		 
		  driver.findElement(By.xpath("(//div[contains(@class,'VfPpkd')])[10]")).click();
		 Thread.sleep(4000);
		 
		 WebElement flag = driver.findElement(By.xpath("(//div[@style='background-position: -1px -2245px;'])[1]"));
		String random = RandomString.make(1);
		 File src = ((TakesScreenshot)flag).getScreenshotAs(OutputType.FILE);
		 File relocate=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testimg"+random+".png");
		 FileHandler.copy(src, relocate);
		 
		 
		 driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("8120585208");
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		  Thread.sleep(1000);
	   
		 driver.quit();
		  
		 
		
		 
		
		  

	}

}
