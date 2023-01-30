package webTableHandlling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NeoStock {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).click();
		driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).sendKeys("9075974831");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Sign Up')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='btn btn-sm neobutton'])[7]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@data-target='modal_buyplans']")).click();
		Thread.sleep(500);
		
		
		

		
		//=========================================================================
		Thread.sleep(1500);
		for(int i=1;i<=12;i++)
		{
			String headtext = driver.findElement(By.xpath("//thead//th["+i+"]")).getText();
			System.out.print(headtext+"  ");
		}
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@id='lnk_pendingorders']")).click();
		
		for(int i=1;i<=33;i++)
		{
			for(int j=1;j<=12;j++)
			{
				WebElement tabledata = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tabledata.getText()+"    ");
			}System.out.println();
		}System.out.println();
		 
		
				
		
		
		
		
	}

}
