package testNG;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class UseOfAnnotations 
{
  
  
  @Test()
  public void a()
  {
	  Reporter.log("a is running...", true);
  }
  
  @Test()
  public void b()
  {
	  Reporter.log("b is running...", true);
  }
  
  @Test()
  public void c()
  {
	  Reporter.log("c is running...", true);
  }
  
  @Test()
  public void d()
  {
	  Reporter.log("d is running...", true);
  }
  
  @Test()
  public void e()
  {
	  Reporter.log("e is running...", true);
  }
  
 
}
