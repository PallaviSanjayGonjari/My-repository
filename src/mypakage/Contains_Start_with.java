package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Start_with {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\velocity\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		Thread.sleep(1000);
		
		String Title=driver.getTitle();
		
		System.out.println("Title of the URL is"+Title);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[contains(@class,'Text__StyledText-oo0kvp-0')])[5]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//p[contains(@class,'Text__StyledText-oo0kvp-0 cHvtRn MenuIt')])[13]")).click();
		
		Thread.sleep(1000);
		driver.close();
		
		

	}

}
