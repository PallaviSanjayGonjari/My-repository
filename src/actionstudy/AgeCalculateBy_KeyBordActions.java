package actionstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AgeCalculateBy_KeyBordActions 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://news.abplive.com/utility/age-calculator.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement birthdate = driver.findElement(By.xpath("//select[@id='birthdate']"));
		Actions act=new Actions(driver);
		act.scrollToElement(birthdate).perform();
		
		act.sendKeys(birthdate,Keys.ENTER).perform();
		Thread.sleep(500);
		for(int i=1;i<=11;i++)
		{
			act.sendKeys(birthdate, Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(birthdate, Keys.ARROW_DOWN).perform();
	
		
		
		
		
		
		

	}

}
