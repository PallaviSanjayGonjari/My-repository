package mypakage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class IsEnable_IsDisplayed_IsSelected {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "G:\\velocity\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
		WebElement getOTPbutton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result=getOTPbutton.isEnabled();
		System.out.println("Current Result is "+result);
		
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNumber")).sendKeys("8120585208");
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		Thread.sleep(1000);
		System.out.println("Current Result is--- "+submit.isEnabled());
		submit.click();
		Thread.sleep(2000);
		
		//OR by using if else--->
		/*if(getOTPbutton.isEnabled())
		{
		boolean result1 = getOTPbutton.isEnabled();
		System.out.println("Current status is "+result1);
		getOTPbutton.click();
		}
		else {
		System.out.println("OTP button is not enabled");
		}*/
		String randm=RandomString.make(3);
		File newsource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File newlocation=new File("G:\\velocity\\SeleniumSCREENSHOTS\\testing"+randm+".png");
		FileHandler.copy(newsource, newlocation);
		
		
		
		
		
		
		
		
	//	driver.close(); 
		
		
	
		
		
		
		
		
		
		
	
		
		

	}

}

