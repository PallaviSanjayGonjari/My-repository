package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		//handling dateby---ByVisibletext()
		// 1.Identify list box to be handled and store it in reference variable
		WebElement day=driver.findElement(By.id("day"));
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s=new Select(day);
		//3. By using one of the select class methods we can select values form list box like
		// 1. selectByVisibleText: selectByVisibleText(String arg0)
		// 2. selectByIndex: selectByIndex(int arg0)
		// 3. selectByValue: selectByValue(String arg0)
		//// 1. selectByVisibleText:
		driver.findElement(By.id("day")).click();
		Thread.sleep(1000);
		s.selectByVisibleText("18");
		
		//handling month by --->ByIndex()
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.id("month"));
		Thread.sleep(1000);
		driver.findElement(By.id("month")).click();
		Thread.sleep(1000);
		
		Select s1=new Select(month);
		Thread.sleep(1000);
		s1.selectByIndex(9);
		
		//handling year by ----> ByValue
		
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.id("year"));
		Thread.sleep(1000);
		driver.findElement(By.id("year")).click();
		Thread.sleep(1000);
		Select s2=new Select(year);
		s2.selectByValue("2022");
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		




	}

}
