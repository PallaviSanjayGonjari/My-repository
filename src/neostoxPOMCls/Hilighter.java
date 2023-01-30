package neostoxPOMCls;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hilighter
{
	
	
	
public static void HilightUserName(WebElement element,WebDriver driver) throws InterruptedException
{
	
	String bgcolor=element.getCssValue("backgroundcolour");
	for(int i=0;i<500;i++)
	{Thread.sleep(1000);
		Changecolor("red",element,driver);
		Changecolor(bgcolor,element,driver);
		
	}
}

public static void Changecolor(String color,WebElement element,WebDriver driver)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("argument[0].style.backgroundcolor= '" +color+"'", element);
	try
	{
		Thread.sleep(100);
	}catch (InterruptedException e) 
	{
		
	}
	
	
}


public static void drawBorder(WebDriver driver)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.border='3px solid black'",driver.findElement(By.id("lbl_username")));

}

public static void generateAlert(WebDriver driver,String message)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("alert('"+message+"')");
}
}
