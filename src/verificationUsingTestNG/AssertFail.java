package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail 
{
  @Test
  public void AssertFailTC() 
  {
	  Assert.fail();
	  Reporter.log("Hi Good evening", true);
  }
}
