package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonValidation 
{
  @Test
  public void validateRadioButtonStatus() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		Assert.assertTrue(radio1.isSelected(), "Radio 1 is not selected TC is failed");
  }
}
