package webTableHandlling;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)
		{
		 WebElement header = driver.findElement(By.xpath("//tbody/tr/th["+i+"]"));
		 System.out.print(header.getText()+"  ");
		}
		
		
	}

}
