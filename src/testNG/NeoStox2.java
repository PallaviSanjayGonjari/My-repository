package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStox2 
{
	 @Test(groups="sanity")
	  public void f()
	  {
		  Reporter.log("f is running...", true);
	  }
	  
	  @Test()
	  public void g()
	  {
		  Reporter.log("g is running...", true);
	  }
	  
	  @Test(groups= {"regr","sanity"})
	  public void h()
	  {
		  Reporter.log("h is running...", true);
	  }
	  
	  @Test(groups="sanity")
	  public void i()
	  {
		  Reporter.log("i is running...", true);
	  }
	  
	  @Test(groups="regr")
	  public void j()
	  {
		  Reporter.log("j is running...", true);
	  }
	  
}
