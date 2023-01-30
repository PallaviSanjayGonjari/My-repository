package testNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTesting 
{
	
  @Test
  public void validateUserID()
  {
	  Reporter.log("User ID is Valid...", true);
  }
  
  @Test
  public void validateACCalance()
  {
	  Reporter.log("Acc Balance is Checked.....", true);
  }
  
  @BeforeMethod
  public void logInToNeoStox()
  {
	  Reporter.log("LogedIn....", true);
  }
  
}
