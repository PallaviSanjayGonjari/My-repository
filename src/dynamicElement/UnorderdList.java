package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderdList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("havelock island");
		Thread.sleep(500);
		List<WebElement> searchList = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(1000);
		System.out.println("No of Items in searchlist are "+searchList.size());
		Thread.sleep(500);
		for(WebElement sl:searchList)
		{
			System.out.println(sl.getText());
			
		}Thread.sleep(500);
		for( WebElement result:searchList)
		{
			String expected="havelock island new name";
			String actual=result.getText();
			Thread.sleep(500);
			
			if(expected.equals(actual))
			{
				System.out.println("Clicked on "+result.getText());
				result.click();
				
				break;
				
			}
		}System.out.println("*************************************************************");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on this page are "+allLinks.size());
		System.out.println("*************************************************************");
		Thread.sleep(500);
		
		List<WebElement> allImg = driver.findElements(By.tagName("img"));
		Thread.sleep(500);
		System.out.println("Total Images on page are "+allImg.size());
		System.out.println("*************************************************************");
		
		
		
		
		
		
		
	
		
	}

}
