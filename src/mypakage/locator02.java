package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator02 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","G:\\velocity\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQiAmaibBhCAARIsAKUlaKSNkZtT9d9Vk3mwz3fP-zSMULpjcP76XoSDZdJEP-nSUPsSYSLIVWoaApbhEALw_wcB_k_&gclid=Cj0KCQiAmaibBhCAARIsAKUlaKSNkZtT9d9Vk3mwz3fP-zSMULpjcP76XoSDZdJEP-nSUPsSYSLIVWoaApbhEALw_wcB");
		driver.manage().window().maximize();
		
		
		//Absolute Xpath
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-Shirts for women");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    	 Thread.sleep(1000);
         driver.findElement(By.xpath("//span[contains(text(),\'Women's Loose T-Shirt\')]")).click();
         Thread.sleep(1000);
         
        
         
//		 driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[2]/div[3]/div[8]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/span[1]/span[1]/span[1]/input[1]")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[2]/div[3]/div[8]/div[10]/div[1]/div[]")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//body/div[@id='a-page']/div[1]/div[3]/div[3]/span[1]/span[1]/span[1]/input[1]")).click();
//		 Thread.sleep(1000);
     	// driver.close();
//		 
		
		
	}

	
}


