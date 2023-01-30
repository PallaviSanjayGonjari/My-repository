package webTableHandlling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement webtable = driver.findElement(By.xpath("//legend[contains(text(),'Web Table Example')]"));
		Actions act=new Actions(driver);
		act.scrollToElement(webtable).perform();
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("No of rows are "+table.size());
		for(WebElement t:table)
		{
			System.out.println(t.getText());
		}
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		System.out.println("No of column are "+header.size());
		for(WebElement h:header)
		{
			System.out.println(h.getText());
		}
		
		//type cast driver object into JavaScriptExecutor and store in ref variable
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//using object call method executeScript
				Thread.sleep(1000);
				js.executeScript("window.scrollBy(0,1000)");
	}

}
