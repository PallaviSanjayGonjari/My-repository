package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedmethod {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement textbox=driver.findElement(By.name("show-hide"));
		System.out.println(textbox.isDisplayed());
		textbox.sendKeys("Good Night");
		driver.findElement(By.name("show-hide")).clear();
		
		WebElement hideButton=driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println(driver.findElement(By.name("show-hide")).isDisplayed());
		
		if(textbox.isDisplayed())
		{
			textbox.sendKeys("Hello");
		}
		else
		{
			System.out.println("Please click on Show then give input...");
			driver.findElement(By.id("show-textbox")).click();
			driver.findElement(By.name("show-hide")).sendKeys("Bye...");
		
			
			
			
		}
		

	}

}
