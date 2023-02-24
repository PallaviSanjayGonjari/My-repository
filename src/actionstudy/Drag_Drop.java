package actionstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//1.Create object of Actions class
		Actions act=new Actions(driver);
		//act.dragAndDrop(source, target).perform();
		act.clickAndHold(source).moveToElement(target).build().perform();
		
//+++++++++++++++++++++++++++++++++
		//***************************
	}

}
