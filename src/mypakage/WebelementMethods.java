package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pallav Gonjari");
		Thread.sleep(10000);
		
	
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(1000);
		//GetText method
		String actualText=driver.findElement(By.xpath("//h1[contains(text(),'Recharge & Pay Bills')]")).getText();
		String ExpectedText="Recharge & Pay Bills on Paytm.";
		System.out.println("Actual text is"+actualText);
		System.out.println("Expected text is"+ExpectedText);
		//OR
		if(actualText.equals(ExpectedText))
		{
			System.out.println("Text is matching Test Case passed");
		}
		else	
		{
			System.out.println("Text is not matching Test Case is Failed");
		}
		}

		

		
		
	
		
	}


