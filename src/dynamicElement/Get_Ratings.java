package dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Get_Ratings {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		//created object of chromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		String rating = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]")).getText();
		System.out.println("Ratings are "+rating);
	}

}
