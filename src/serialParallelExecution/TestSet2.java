package serialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSet2
{
  @Test
  public void f() throws InterruptedException
  {

	  System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://translate.google.co.in/");
		  Thread.sleep(2000);
  }
}
