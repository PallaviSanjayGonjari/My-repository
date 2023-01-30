package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oprators {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQiAmaibBhCAARIsAKUlaKSNkZtT9d9Vk3mwz3fP-zSMULpjcP76XoSDZdJEP-nSUPsSYSLIVWoaApbhEALw_wcB_k_&gclid=Cj0KCQiAmaibBhCAARIsAKUlaKSNkZtT9d9Vk3mwz3fP-zSMULpjcP76XoSDZdJEP-nSUPsSYSLIVWoaApbhEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=wall+decore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("wall stikers");
		//Thread.sleep(1000);
		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wall stikers");
		// Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[mit-button']@id='nav-search-sub")).click();
		
		
	}

}
