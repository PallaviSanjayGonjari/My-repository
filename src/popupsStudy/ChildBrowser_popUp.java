package popupsStudy;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_popUp {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		String mainpgId = driver.getWindowHandle();
		System.out.println(mainpgId);
		Set<String> allIds = driver.getWindowHandles();
		Iterator<String> it = allIds.iterator();
		 String mainpgID=it.next();
		 System.out.println(mainpgID);
		 String childpgid=it.next();
		 System.out.println(childpgid);
		 driver.switchTo().window(childpgid);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 driver.findElement(By.id("the7-search")).sendKeys("20 AUG EVEN");
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 driver.close();
		 driver.switchTo().window(mainpgId);
		 Thread.sleep(1000);
		 System.out.println(driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText());
		 driver.quit();
		
		
		
	}

}
