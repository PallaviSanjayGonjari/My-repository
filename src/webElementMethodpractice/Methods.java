package webElementMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://www.meesho.com/");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("baby caps");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//	System.out.println(	driver.findElement(By.xpath("((//h5[@color='greyBase'])[12]")));

	//driver.getCurrentUrl();
	
	
	Thread.sleep(1000);
	
		

	}

}
