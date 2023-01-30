package popupsStudy;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popUp {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		
		Alert al = driver.switchTo().alert();
		//al.accept();
		//al.accept();
		al.dismiss();
		//System.out.println(al.getText());
	
		String text = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		System.out.println("text is "+text);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("No of links are "+alllinks.size());
		for(WebElement all:alllinks)
		{
			System.out.println(all.getText());
		}
		
	
	}

}
