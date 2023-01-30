package actionstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement newacc = driver.findElement(By.linkText("Create New Account"));
		Actions act=new Actions(driver);
		act.click(newacc).perform();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		Thread.sleep(1000);
		act.keyDown(firstname, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("allavi").build().perform();
		WebElement lastname = driver.findElement(By.name("lastname"));
		Thread.sleep(500);
		act.keyDown(lastname, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("alsande").build().perform();
		Thread.sleep(500);
		WebElement mbleno = driver.findElement(By.name("reg_email__"));
		act.sendKeys(mbleno, "8120585208").perform();
		Thread.sleep(500);
		WebElement passwrd = driver.findElement(By.id("password_step_input"));
		act.sendKeys(passwrd, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("rashant").keyDown(Keys.SHIFT).sendKeys("2").keyUp(Keys.SHIFT).sendKeys("123").build().perform();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		act.click(day).perform();
		Thread.sleep(500);
		
		/*for(int i=10;i<=12;i++)
		{
			act.sendKeys(day, Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}*/
		act.sendKeys(day, Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(day,Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(day,Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(day,Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(day, Keys.ENTER).perform();
		Thread.sleep(1500);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		act.click(month).perform();
		act.sendKeys(month, Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(month, Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(month, Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(month, Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(month, Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(month, Keys.ARROW_UP).perform();
		act.click(month).perform();
		Thread.sleep(1500);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		act.click(year).perform();
		for(int i=2022;i>=1995;i--)
		{
			act.sendKeys(year, Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}
		act.sendKeys(year, Keys.ENTER).perform();
		WebElement gender = driver.findElement(By.name("sex"));
		Thread.sleep(500);
		act.click(gender).perform();
		Thread.sleep(500);
		WebElement submit = driver.findElement(By.name("websubmit"));
		act.click(submit).perform();
		Thread.sleep(1500);
		
		
		
		
	}

}

