package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy
{
  @Test
  public void validateEquals()
  {
	  String a="abc";
	  String b="abc";
	  
	  Assert.assertEquals(a, b,"a & b are not matching,TC failed");
	  
  }
}
