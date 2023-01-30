package actionstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DblClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.Create object of Actions class
		Actions act=new Actions(driver);
		WebElement dblclick = driver.findElement(By.xpath("//button[contains(text(),'Double Click Me !')]"));
		act.doubleClick(dblclick).perform();
		//Handling Alert popUp
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(500);
		alrt.accept();
		driver.close();

	}

}
