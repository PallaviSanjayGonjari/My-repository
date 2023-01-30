package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_CjwKCAjwtp2bBhAGEiwAOZZTuGH-uwrzuJc4BYv7aBjkHK7scRrCsqJ2qNX4HGgzdINFPWkPVpCrwRoCwx8QAvD_BwE_k_&gclid=CjwKCAjwtp2bBhAGEiwAOZZTuGH-uwrzuJc4BYv7aBjkHK7scRrCsqJ2qNX4HGgzdINFPWkPVpCrwRoCwx8QAvD_BwE");
		driver.manage().window().maximize();  //maximize web page
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women watches");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("women watches");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
}
}