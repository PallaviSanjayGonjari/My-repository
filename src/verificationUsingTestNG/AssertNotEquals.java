package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals 
{
  @Test
  public void AssertNotEqual()
  {
	  String a="abc";
	  String b="abcd";
	  Assert.assertNotEquals(a,b,"a & b are equals,TC is Failed");
  }
}
