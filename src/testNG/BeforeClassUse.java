package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse
{
  @Test
  public void TC1()
  {
	  Reporter.log("TC is Running.....", true);
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("before method is running....", true);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("After method is running....", true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running.... ", true);
  } 
  
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("before class is running....", true);
  }
  
  
}
