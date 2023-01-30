package webTableHandlling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//get all table
		//using for loop
		for(int i=2;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				WebElement tabledata = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tabledata.getText()+"    ");
			}System.out.println();
		}System.out.println();
	}

}
