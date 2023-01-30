package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\velocity\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		Thread.sleep(1000);
		String Title=driver.getTitle();
		System.out.println("Title of the URL is"+Title);
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("saree");
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/*[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//p[@class='Text__StyledText-oo0kvp-0 cSmmqa'])[1]")).click();
		Thread.sleep(10000);
		driver.navigate().to("https://www.meesho.com/");
		Thread.sleep(10000);
		
		driver.close();
//		driver.findElement(By.xpath("(//span[@class='Text__StyledText-oo0kvp-0 dAZEcr'])[1]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("(//p[@color='greyT1'])[19]")).click();
//		Thread.sleep(10000);
//		driver.close();

		
	}

}
