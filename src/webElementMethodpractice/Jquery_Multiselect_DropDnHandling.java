package webElementMethodpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery_Multiselect_DropDnHandling
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	      driver.findElement(By.id("justAnInputBox")).click();
	    //  selectChoiceValues(driver,"choice1");
	      
		//  selectChoiceValues(driver,"choice 2","choice 3","choice6 2 1");
		  selectChoiceValues(driver,"all");

	}
	public static void selectChoiceValues(WebDriver driver,String... value)
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceList)
			{
				String text=item.getText();
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
						
					}
				}
			}
		}
		else
		{
		for(WebElement item:choiceList)	
		{
			item.click();
		}
		}
	}
	

}
