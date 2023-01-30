package javaScriptExecutor;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position_of_browser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//how to get position of browser
		
		 driver.manage().window().getPosition();
		System.out.println("default posion is"+ driver.manage().window().getPosition());
		//set position of browser  
		Point p=new Point(500,300);
		driver.manage().window().setPosition(p);
		 driver.manage().window().getPosition();
		
	}

}
