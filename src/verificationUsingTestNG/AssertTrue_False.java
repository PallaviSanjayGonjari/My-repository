package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_False 
{
  @Test
  public void assertTrue() 
  {
	  boolean a=false;
	  Assert.assertTrue(a,"a value is false,TC is failed");
  }
}
