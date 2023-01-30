package webTableHandlling;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiAssertTest 
{
	  String a=null;
	  String b="abc";
	  String c="abc";
	  String d="ac";
  @Test
  public void notnullcheck() 
  {
	  Assert.assertNull(a,"a value is not null TC Failed");
	  Assert.assertNotNull(b,"b is null TC Failed");
  }
  @Test
  public void notEquals()
  {
	 Assert.assertNotEquals(c, d, "c & d are equal  TC failed");
	 Assert.assertEquals(b, c,"b and c are not matching, TC is failed");
  }
}
