package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStox1 
{
	 @Test(groups="regr")
	  public void a()
	  {
		  Reporter.log("a is running...", true);
	  }
	  
	  @Test()
	  public void b()
	  {
		  Reporter.log("b is running...", true);
	  }
	  
	  @Test(groups= {"regr","sanity"})
	  public void c()
	  {
		  Reporter.log("c is running...", true);
	  }
	  
	  @Test(groups="regr")
	  public void d()
	  {
		  Reporter.log("d is running...", true);
	  }
	  
	  @Test(groups="sanity")
	  public void e()
	  {
		  Reporter.log("e is running...", true);
	  }
	  
}
