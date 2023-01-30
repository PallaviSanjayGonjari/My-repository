package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
	    driver.switchTo().frame("iframeResult");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
	    Thread.sleep(1000);
		WebElement text=driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(text.getText());
		

	}

}
