package actionstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Study {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement signinbtn = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		//signinbtn.click();//by using WebElement method
		//Using actions class
		//1.Create an object of actions class and pass WebDriver object as a parameter
		Actions act=new Actions(driver);
		act.click(signinbtn).perform();
		//act.moveToElement(signinbtn).click().build().perform();
		
		
		
		
	}

}
