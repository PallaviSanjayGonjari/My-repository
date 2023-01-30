package javaScriptExecutor;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_SetSizeOfWebpage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//how to get size of browser
		System.out.println(driver.manage().window().getSize());
		
		//how to set size?
		//create object dimension class and pass parameter value
		Dimension d=new Dimension(500,400);
		//using setsize method and passing obj of diamension class as a parameter
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		

	}

}
