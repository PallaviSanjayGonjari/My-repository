package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateRadioButton 
{
  @Test
  public void RadioButtonvalidate() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		if(radio1.isSelected())
		{
			Reporter.log("Radio Button is selected TC Pass",true);
		}
		else
		{
			Reporter.log("Radio1 Button is not selected TC Failed",true);
		}
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", radio1);
		radio1.click();
		 
		Assert.assertTrue(radio1.isSelected(),"Radio button is not selected TC failed");
  }
}
