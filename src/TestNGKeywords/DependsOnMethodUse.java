package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	 @Test 
	  public void d() {
		  Reporter.log("d is Running",true);
	  }
	  @Test(dependsOnMethods = {"d"})
	  public void a()
	  {
		  Reporter.log("a is Running",true);
	  }
	  @Test 
	  public void v() 
	  {
		  Reporter.log("v is Running",true); 
	  }
}
