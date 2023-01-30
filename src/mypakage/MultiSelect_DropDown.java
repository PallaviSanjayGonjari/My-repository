package mypakage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_DropDown {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(1000);
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s1=new Select(fruits);
		s1.selectByVisibleText("Banana");
		s1.selectByValue("orange");
		s1.selectByIndex(1);
		Thread.sleep(1000);
		List<WebElement> getalloptions = s1.getAllSelectedOptions();
		
		Iterator<WebElement> it = getalloptions.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		for(int i=0;i<=getalloptions.size()-1;i++)
		{
			System.out.println(getalloptions.get(i).getText());
		}
	}

}
