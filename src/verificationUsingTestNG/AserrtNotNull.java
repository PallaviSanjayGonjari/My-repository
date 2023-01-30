package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AserrtNotNull 
{
  @Test
  public void assertNotNull() 
  {
	  String a=null;
	  Assert.assertNotNull(a,"a value is null,TC is Failed");
	  
  }
}
