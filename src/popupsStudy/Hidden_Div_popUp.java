package popupsStudy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_Div_popUp {

	public static void main(String[] args) 
	{
		//creating object of chrome options
		ChromeOptions opsn=new ChromeOptions();
		//opsn.addArguments("--disable-notifications");
		opsn.addArguments("--start-maximized");
		opsn.addArguments("--incognito");
		ArrayList<String> al=new ArrayList<>();
		al.add("--start-maximized");
		al.add("--incognito");
		opsn.addArguments(al);

		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver(opsn);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Payal");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
