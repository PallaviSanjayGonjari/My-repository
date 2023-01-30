package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		  Thread.sleep(1000);
		  
		//switching focus from main page to frame2//outer frame
		  driver.switchTo().frame("frame2");
		  Thread.sleep(1000);
		
	
	  //Handle drop-down 
	  //Select By --->VisibleText	  
		  WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
		  Select s1=new Select(animals);
		  animals.click();
		 // s1.selectByVisibleText("Baby Cat");
		
	  //select By ---->Index 
		  s1.selectByIndex(1);
		System.out.println(s1.isMultiple()); 
		  
		
	  //select by ---->
	
		// s1.selectByValue("big baby cat");
		
	  //switching frame2 to main page
		  driver.switchTo().defaultContent();//frame2 to main page
		  String text=driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]")).getText();
		  System.out.println(text);
		  Thread.sleep(1000);
		 // driver.close();
	}

}
