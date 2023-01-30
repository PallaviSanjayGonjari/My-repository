package webTableHandlling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserName_Validation_TC {

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
		
		String actualUserName = driver.findElement(By.xpath("//span[@id='lbl_username']")).getText();
		String expectedUserName="Hi pallavi gonjari";
		
		
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("Your User Name Is correct (As Expected in precondition) so Test case is----> PASS");
		}
		else
		{
			System.out.println("Your User Name Is Incorrect (Not As Expected in precondition) so Test case is----> FAIL");
		}
		
		    JavascriptExecutor js = ((JavascriptExecutor)driver);
		    //Drawing border to userName by using java scriptExecutor
			
			js.executeScript("arguments[0].style.border='3px solid red'",driver.findElement(By.xpath("//span[@id='lbl_username']")) );
			Thread.sleep(2000);
			
			//Get title by JsE
			String title = js.executeScript("return document.title;").toString();
			System.out.println(title);
			
			//Sendkeys using JsE
			js.executeScript("arguments[0].value='Pallavi'",driver.findElement(By.xpath("//input[@id='txt_instruments']")));
			Thread.sleep(1000);
			
			//scrolling up and down by JsE
			js.executeScript("window.scrollBy(500,0)",driver.findElement(By.xpath("//div[@class='stx-subholder']")));
			//js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//div[@class='stx-subholder']")));
			Thread.sleep(2000);
			
			//click element by javascript Executor
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@id='graphlink']")));
			Thread.sleep(2000);
			
			//zoom page by JsE
			js.executeScript("document.body.style.zoom='200%'"); 
			Thread.sleep(1000);
			
			//refreshing the page by JsE
			js.executeScript("history.go(0)");
			Thread.sleep(1000);
			
	
			//Generate alert by JsE
			js.executeScript("alert('" +"Test Case Pass"+ "')");
			Thread.sleep(1000);
			
			Alert alrt = driver.switchTo().alert();
			alrt.accept();
			
			
			
			
			
				
	}
	

}
