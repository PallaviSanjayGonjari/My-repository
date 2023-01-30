package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	//switch Selenium focus from main page to frame
		 
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		Thread.sleep(1000);
	//current focus is on frame now
		WebElement text=driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry please')]"));
		System.out.println(text.getText());   
		Thread.sleep(1000);
		System.out.println("Clicking on -Click to start selenium practice now");
		driver.findElement(By.xpath("//a[contains(text(),'Click to Start')]")).click();
		Thread.sleep(1000);
		
		System.out.println("Clicking on whatsApp icon..... ");
		driver.findElement(By.xpath("//div[@class='ctc-analytics']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	
	
		
		
		
		
		
		

	}

}
