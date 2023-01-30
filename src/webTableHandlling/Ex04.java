package webTableHandlling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		
		//outer For loop
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
					String headerText = driver.findElement(By.xpath("//tbody/tr["+i+"]/th["+j+"]")).getText();
					System.out.print(headerText+"   ");
				}
				else
				{
					String dataText = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(dataText+"    ");
				}
			}System.out.println();
		}
	    	
		
	}

}
