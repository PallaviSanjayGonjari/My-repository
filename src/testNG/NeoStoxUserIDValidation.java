package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeoStoxUserIDValidation 
{
  @BeforeClass
  public void launchApplication()
  {
	  Reporter.log("Launching Browser....", true);
  }
  
  @BeforeMethod
  public void logInToNeoStox()
  {
	  Reporter.log("LoggedIn....", true);
  }
  
  @Test
  public void validateUserId()
  {
	  Reporter.log("User Id is vali...", true);
  }
  @AfterMethod
  public void logOutFromNeoStox()
  {
	  Reporter.log("Logged Out....", true);
  }
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("Closing Browser", true);
  }
}
