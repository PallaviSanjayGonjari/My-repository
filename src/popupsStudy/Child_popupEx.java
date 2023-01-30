package popupsStudy;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popupEx {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[2]")).click();
		Set<String> IDs = driver.getWindowHandles();
		Thread.sleep(1000);
		Iterator<String> it = IDs.iterator();
		 String mainpageId = it.next();
		 String childpageId = it.next();
		 Thread.sleep(1000);
		System.out.println(mainpageId);
		System.out.println(childpageId);
		Thread.sleep(1000);
		driver.switchTo().window(childpageId);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pallavi");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.switchTo().window(mainpageId);
		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry')]"));
		System.out.println(text.getText());
		driver.quit();
	}

}
