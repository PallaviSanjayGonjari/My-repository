package actionstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		//1.Create object of Actions class
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		Thread.sleep(1000);
		WebElement quit = driver.findElement(By.xpath("//body[1]/ul[1]/li[7]/span[1]"));
		Thread.sleep(1000);
		act.click(quit).perform();
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(1000);
		alrt.accept();
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'HTML5 Polyfill (Firefox)')]"));
		act.scrollToElement(text).perform();
		act.scrollByAmount(10, 10);
		driver.close();
		
		

	}

}
