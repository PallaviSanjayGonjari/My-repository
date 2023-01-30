package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedmethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//WebElement checkbox1=driver.findElement(By.xpath("//input[@value='Radio1']"));
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		//checkbox1.click();
		boolean result=checkbox1.isSelected();
		System.out.println("Current result is "+result);
		
		if(checkbox1.isSelected())
		{
			System.out.println("Thank You check box is selected");
		}
		else 
		{
			System.out.println("Checkbox is not selected..");
			System.out.println("checking check box now......");
			checkbox1.click();
			System.out.println("Now Check box is selected");
		}
		
		//Scrolling
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,900)");
		js.executeScript("arguments[0].scrollIntoView(true)",checkbox1);
	}

}
